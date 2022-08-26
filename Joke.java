// Import Scaner to receive input
import java.util.Scanner;

public class Joke {
    public static void main(String[] args) {
        // If user tells a knock-knock joke
        if (args.length > 0 && args[0].equals("knock knock")) {
            System.out.print("Who's there? ");
            Scanner keyboard = new Scanner(System.in);
            String userInput = new String();
            userInput = keyboard.nextLine();
            System.out.println(userInput + " who?");
        } // if
        // If user does not tell a knock-knock joke
        else {
            System.out.println("Tell me a knock-knock joke.");
        } // else
    } // void main
} // class Joke