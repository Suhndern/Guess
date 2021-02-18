import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I have, in one hand, a coin! Which hand is it in?");

        // Get user's choice
        boolean leftHand;
        switch (scanner.next().toLowerCase()) {
            case "left":
                leftHand = true;
                break;
            case "right":
                leftHand = false;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + scanner.next().toLowerCase());
        }

        // Present the results
        String finalMessage;
        if(leftHand == new Random().nextBoolean()) {
            finalMessage = "That's right! Congrats!";
        }
        else {
            finalMessage = "Nope! Sorry, that wasn't right!";
        }
        System.out.println(finalMessage);

        // Ask for another round
        System.out.println("Wanna go again? (Y/N)");
        switch (scanner.next().toLowerCase()) {
            case "y":
                run();
                break;
            case "n":
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + scanner.next().toLowerCase());
        }
    }
    
    public static void main(String[] args) {
        run();
    }
}
