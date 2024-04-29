import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int secretNumber1 = random.nextInt(100) + 1;
            int secretNumber2 = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Try to guess the number between 1 and 100.");
            List <Integer> list = new ArrayList<Integer>();
            list.add(secretNumber);
            list.add(secretNumber1);
            list.add(secretNumber2);
            int count = 0 ;
            System.out.println("Guess the correct option : ") ;
            for (int i : list){
                count += 1;
                System.out.println(count +"."+ i);
            }  
            while (!guessedCorrectly && attempts < 3) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}