package com.example.numberguessinggame;

import java.util.Scanner;

public class GuessingGame {

    // Function that implements the
    // number guessing game
    public static void
    guessingNumber()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100
                * Math.random());

        // Given J trials
        int J = 6;

        int i, guess;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 6 trials.");

        // Iterate over J Trials
        for (i = 0; i < J; i++) {

            System.out.println(
                    "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != J - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != J - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == J) {
            System.out.println(
                    "You have exhausted"
                            + " J trials.");

            System.out.println(
                    "The number was " + number);
        }
    }

    // Driver Code
    public static void main(String[] arg)
    {
        // Function Call
        guessingNumber();
    }
}