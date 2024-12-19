
package welcome;

import java.util.Scanner;
public class TaskOne {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            int original = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            boolean correctGuess = false;
            System.out.println("    Welcome to out Number gussing Game    ");
            System.out.println("................................................");
            System.out.println("""
                               Try to guss a number between 1 and 100 (inclusive).
                               You have up to"10" attempts! """);
            while (attempts < 10 && !correctGuess) {
                System.out.println("Enter your guess: ");
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input! please enter a number.");
                    input.next();
                    continue;
                }
                int guess = input.nextInt();
                attempts++;
                if (guess < original) {
                    System.out.println("Too low! Try Again");
                } else if (guess > original) {
                    System.out.println("Too High! Try Again");
                } else {
                    System.out.println("Correct! You guessed the correct answer in " + attempts + " attempts");
                    correctGuess = true;
                }
            }

        }
    }
}
