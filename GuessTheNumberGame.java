
	import java.util.Random;
	import java.util.Scanner;

	public class GuessTheNumberGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int minRange = 1;
	        int maxRange = 100;
	        int maxAttempts = 10;
	        int rounds = 3;
	        
	        int totalScore = 0;
	        
	        System.out.println("Welcome to Guess the Number Game!");
	        
	        for (int round = 1; round <= rounds; round++) {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            
	            System.out.println("\nRound " + round + ":");
	            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
	            
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                
	                attempts++;
	                
	                if (userGuess == targetNumber) {
	                    int roundScore = maxAttempts - attempts + 1;
	                    totalScore += roundScore;
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    System.out.println("Round Score: " + roundScore);
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Your guess is too low. Try again.");
	                } else {
	                    System.out.println("Your guess is too high. Try again.");
	                }
	                
	                if (attempts == maxAttempts) {
	                    System.out.println("Out of attempts! The number was " + targetNumber + ".");
	                }
	            }
	        }
	        
	        System.out.println("\nGame Over!");
	        System.out.println("Total Score: " + totalScore);
	        
	        scanner.close();
	    }
	}



