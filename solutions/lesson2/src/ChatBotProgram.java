import java.util.Scanner;

/**
 * Chatbot Program.
 */
public class ChatBotProgram {

    public static void main(String... args) {
        ChatBot chatBot = new ChatBot();
        System.out.println(chatBot.name + " > " + chatBot.greeting());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Me > ");
            String input = scanner.nextLine();
            String response = chatBot.sendMessage(input);
            System.out.println(chatBot.name + " > " + response);
        }
    }
}
