import java.util.Scanner;

/**
 * Chatbot Program.
 */
public class ChatBotProgram {

  String[] inputs = {"hi", "how are you", "what's your name"};
  String[] responses = {"hi", "very well", "I'm Super Bot"};
  String defaultResponse = "Sorry I don't understand";

  public String sendMessage(String input) {
    for (int i = 0; i < inputs.length; i = i + 1) {
      if (inputs[i].equals(input)) {
        return responses[i];
      }
    }
    return defaultResponse;
  }

  public static void main(String ... args) {

    System.out.println("Super Bot > Hi there");

    ChatBotProgram program = new ChatBotProgram();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Me > ");
      String input = scanner.nextLine();
      String response = program.sendMessage(input);
      System.out.println("Super Bot > " + response);
    }
  }
}
