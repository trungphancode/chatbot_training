package com.kuriosityrobotics.android.kuchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText messageText;
    TextView conversationText;
    ImageButton sendButton;
    ChatBot chatBot = new ChatBot();
    ScrollView conversationScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = (EditText) this.findViewById(R.id.message_text);
        conversationText = (TextView) this.findViewById(R.id.conversation_text);
        conversationText.setText(chatBot.name + " > " + chatBot.greeting());
        conversationScrollView = (ScrollView) this.findViewById(R.id.conversation_scrollview);
        sendButton = (ImageButton) this.findViewById(R.id.send_btn);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSendButtonClick();
            }
        });
    }

    void onSendButtonClick() {
        String input = messageText.getText().toString();
        String response = chatBot.sendMessage(input);
        String oldDialog = conversationText.getText().toString();
        String newDialog =
                oldDialog + "\n\n"
                + "Me > " + input + "\n\n"
                + chatBot.name + " > " + response;
        conversationText.setText(newDialog);
        messageText.setText("");

        // search solution in Stack overflow to scroll to the bottom.
        conversationScrollView.post(new Runnable() {
            @Override
            public void run() {
                conversationScrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }
}
