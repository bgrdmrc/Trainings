
import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("\n ************** Welcome to the Rock-Paper-Scissors Game! **************");
        
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("Choose one: rock, paper, or scissors.");
        String userChoice = input.nextLine().toLowerCase();

        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);
        
        if(userChoice.equals(computerChoice)){
            System.out.println("It's a draw!");
        }else if(userChoice.equals("rock") && computerChoice.equals("scissors") || 
                 userChoice.equals("paper") && computerChoice.equals("rock") || 
                 userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }
    } 
}
