		import java.util.Scanner;
		import java.util.Random;
		public class NumberGausingGame {
			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Random rm = new Random();
		        int numberToGuess = rm.nextInt(100) + 1;
		        int attempts = 0;
		        boolean hasGuessedCorrectly = false;
		        System.out.println("!!Welcome to the Number Guessing Game!!!");
		        System.out.println("I have selected a random number between 1 and 100. Can you guess it?");
		        while (!hasGuessedCorrectly) {
		            System.out.print("Enter your guess: ");
		            int playerGuess = sc.nextInt();
		            attempts++;
		            if (playerGuess < 1 || playerGuess > 100) {
		                System.out.println("Please enter a number between 1 and 100.");
		            } else if (playerGuess < numberToGuess) {
		                System.out.println("Too low! Try again.");
		            } else if (playerGuess > numberToGuess) {
		                System.out.println("Too high! Try again.");
		            } else {
		                hasGuessedCorrectly = true;
		                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
		            }
		        }
		        sc.close();
		    }
		}
