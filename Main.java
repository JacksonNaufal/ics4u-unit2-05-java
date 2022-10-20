/*
* The program gets a input from the user to use
* in the JacksonStacks program.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-17
*
* This is a JacksonStacks program.
*/

import java.util.Scanner;

/**
 * This is the main class.
 * Class Main
 */
final class Main {

    /**
     * Multiple usage of same string "Calculating...".
     */
    public static final String CALCULATING = "Calculating...";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final int arrayPopped;
        final int peakNumber;

        // This is a stack program
        final Scanner userInt = new Scanner(System.in);
        final Scanner removeInt = new Scanner(System.in);
        final JacksonStacks stackNum = new JacksonStacks();

        // Input user loop.
        try {
            while (true) {
                System.out.print("Enter a number!: ");
                final int userInput = userInt.nextInt();
                if (userInput == -1) {
                    break;
                } else {
                    stackNum.push(userInput);
                }
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input, Not added to array!");
            System.out.println("Program ended!");
        }
        // Shows the first stack.
        stackNum.finishedStack();

        // Before the new popped array.
        System.out.println("\nThe new array is");
        System.out.println(CALCULATING);

        // Shows the popped array.
        arrayPopped = stackNum.pop();
        stackNum.finishedStack();

        // The peak number.
        System.out.println("\nThe peak number is");
        System.out.println(CALCULATING);

        // what the peak number is.
        peakNumber = stackNum.peak();
        System.out.println(peakNumber);

        // what the cleared array is
        System.out.println("\nThe cleared Array Is Empty!");
        System.out.println("Calculating ...");
        stackNum.clearedArray();
        stackNum.finishedStack();

        // End of program.
        System.out.println("\nDone!");
    }
}
