/*
 *
 * The program calculates the amount of logs
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-10-20
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the starting of main program.
*/
public final class Index {
    /**
     * The utility class lint exception rule.
     *
    */
    private Index() {
        // nothing called
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selection(rock,paper,scissors): ");
        String userInput = sc.nextLine();
        userInput = userInput.replaceAll("\\r|\\n", "");
        final Random rand = new Random();
        final int random = rand.nextInt(2);
        String computerInput = "";
        if (random == 0) {
            computerInput = "scissors";
        } else if (random == 1) {
            computerInput = "rock";
        } else if (random == 2) {
            computerInput = "paper";
        }
        System.out.println("The computer guessed " + computerInput);
        switch (computerInput) {
            case "rock":
                if ("rock".equals(userInput)) {
                    System.out.println("You tied with the computer!");
                } else if ("paper".equals(userInput)) {
                    System.out.println("You won against the computer!");
                } else if ("scissors".equals(userInput)) {
                    System.out.println("You lost against the computer!");
                } else {
                    System.out.println("Invalid input.");
                }
                break;
            case "paper":
                if ("rock".equals(userInput)) {
                    System.out.println("You lost against the computer!");
                } else if ("paper".equals(userInput)) {
                    System.out.println("You tied with the computer!");
                } else if ("scissors".equals(userInput)) {
                    System.out.println("You won against the computer!");
                } else {
                    System.out.println("Invalid input.");
                }
                break;
            case "scissors":
                if ("rock".equals(userInput)) {
                    System.out.println("You won against the computer!");
                } else if ("paper".equals(userInput)) {
                    System.out.println("You lost against the computer!");
                } else if ("scissors".equals(userInput)) {
                    System.out.println("You tied with the computer!");
                } else {
                    System.out.println("Invalid input.");
                }
                break;
            default:
                break;
        }
        System.out.println("\nDone.");
    }
}
