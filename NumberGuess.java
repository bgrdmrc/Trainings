import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\n ************** Welcome to the Number Guessing Game! **************");
        System.out.println("  + I'm thinking of a number between 1 and 100.");

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfTries = 0;

        while (userGuess != numberToGuess) {
            System.out.print("  + Enter your guess: ");
            userGuess = input.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("  + Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("  + Too high! Try again.");
            } else {
                System.out.println("  + Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        
    }
}