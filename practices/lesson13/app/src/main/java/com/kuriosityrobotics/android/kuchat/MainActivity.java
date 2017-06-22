package com.kuriosityrobotics.android.kuchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText messageText;
    TextView conversationText;
    ImageButton sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = (EditText) this.findViewById(R.id.message_text);
        conversationText = (TextView) this.findViewById(R.id.conversation_text);
        sendButton = (ImageButton) this.findViewById(R.id.send_btn);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSendButtonClick();
            }
        });
    }

    void onSendButtonClick() {
        conversationText.setText(conversationText.getText() + "\n" + messageText.getText());
        messageText.setText("");
    }
}
