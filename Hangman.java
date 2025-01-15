import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String wordToGuess = "BUGRADEMIRCI";
        StringBuilder wordGuess = new StringBuilder("____");
        int attemptsLeft = 6;
        
        System.out.println("Welcome to Hangman!");
        
        while (attemptsLeft > 0 && wordGuess.toString().contains("_")) {
            System.out.println("Word: " + wordGuess);
            System.out.println("Rest Of Tries: " + attemptsLeft);
            System.out.print("Guess a letter: ");
            String guess = scanner.nextLine().toUpperCase();
            
            if (wordToGuess.contains(guess)) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess.charAt(0)) {
                        wordGuess.setCharAt(i, guess.charAt(0));
                    }
                }
                System.out.println("Correct!");
            } else {
                attemptsLeft--;
                System.out.println("Wrong!");
            }
        }
        
        if (wordGuess.toString().equals(wordToGuess)) {
            System.out.println("Congratulations! You got the word right.");
        } else {
            System.out.println("Sorry, you lost. The correct word is: " + wordToGuess);
        }
    }
}
