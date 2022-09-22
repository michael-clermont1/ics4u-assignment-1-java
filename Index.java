/*
 *
 * The program plays a rock paper scissors game
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
     * Constant Variable Rock.
     */
    static final String ROCK = "rock";
    /**
     * Constant Variable Paper.
     */
    static final String PAPER = "paper";
    /**
     * Constant Variable Scissors.
     */
    static final String SCISSORS = "scissors";
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
            computerInput = SCISSORS;
        } else if (random == 1) {
            computerInput = ROCK;
        } else if (random == 2) {
            computerInput = PAPER;
        }
        System.out.println("The computer guessed " + computerInput);
        final String tie = "You tied with the computer!";
        final String won = "You won against the computer!";
        final String lost = "You lost against the computer!";
        final String invalid = "Invalid Input.";
        switch (computerInput) {
            case ROCK:
                if (ROCK.equals(userInput)) {
                    System.out.println(tie);
                } else if (PAPER.equals(userInput)) {
                    System.out.println(won);
                } else if (SCISSORS.equals(userInput)) {
                    System.out.println(lost);
                } else {
                    System.out.println(invalid);
                }
                break;
            case PAPER:
                if (ROCK.equals(userInput)) {
                    System.out.println(lost);
                } else if (PAPER.equals(userInput)) {
                    System.out.println(tie);
                } else if (SCISSORS.equals(userInput)) {
                    System.out.println(won);
                } else {
                    System.out.println(invalid);
                }
                break;
            case SCISSORS:
                if (ROCK.equals(userInput)) {
                    System.out.println(won);
                } else if (PAPER.equals(userInput)) {
                    System.out.println(lost);
                } else if (SCISSORS.equals(userInput)) {
                    System.out.println(tie);
                } else {
                    System.out.println(invalid);
                }
                break;
            default:
                break;
        }
        System.out.println("\nDone.");
    }
}
