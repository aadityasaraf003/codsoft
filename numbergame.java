import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5; // Limiting the number of attempts
        int score = 0; // Initialize the score

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = minRange + random.nextInt(maxRange - minRange + 1);
            System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + "/" + attempts + ": Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score += attempts - attempt + 1; // Update the score based on attempts remaining
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempt == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes");

        }

        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();
    }
}
