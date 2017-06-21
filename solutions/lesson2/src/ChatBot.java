/**
 * ChatBot that can say greeting and respond to a message.
 */
public class ChatBot {

    String name = "Super Bot";
    String[] expectedInputs = {"hi", "how are you", "what's your name"};
    String[] responses = {"hi", "very well", "I'm Super Bot"};

    String greeting() {
        return "Hi there";
    }

    String sendMessage(String input) {
        String response = "Sorry I don't understand";
        for (int i = 0; i < expectedInputs.length; i = i + 1) {
            if (expectedInputs[i].equals(input)) {
                response = responses[i];
                break;
            }
        }
        return response;
    }
}
