import java.util.Scanner;

/**
 * Chatbot Program.
 */
public class ChatBotProgram {

    public static void main(String... args) {
        System.out.println("Super Bot > Hi there");

        String[] expectedInputs = {"hi", "how are you", "what's your name"};
        String[] responses = {"hi", "very well", "I'm Super Bot"};

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Me > ");
            String input = scanner.nextLine();
            String response = "Sorry I don't understand";
            for (int i = 0; i < expectedInputs.length; i = i + 1) {
                if (expectedInputs[i].equals(input)) {
                    response = responses[i];
                    break;
                }
            }
            System.out.println("Super Bot > " + response);
        }
    }
}
