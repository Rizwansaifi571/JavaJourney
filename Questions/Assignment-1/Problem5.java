import java.util.Random;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 10
        int RandomNumber = random.nextInt(10) + 1;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 10:");

        while (userGuess != RandomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            switch (Integer.compare(userGuess, RandomNumber)) {
                case -1:
                    System.out.println("Your guess is too low. Try again!");
                    break;
                case 1:
                    System.out.println("Your guess is too high. Try again!");
                    break;
                case 0:
                    System.out.println("Congratulations! You've guessed the correct number: " + RandomNumber);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        }

        scanner.close();
    }
}
