import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != numberToGuess) {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if (guess < numberToGuess) System.out.println("Too low!");
            else if (guess > numberToGuess) System.out.println("Too high!");
            else System.out.println("Correct!");
        }
    }
}
