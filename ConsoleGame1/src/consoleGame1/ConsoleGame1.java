package consoleGame1;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame1 {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 100;
        Random random = new Random();
        System.out.println("Guess number from 1-100.");
        Scanner scanner = new Scanner(System.in);

        boolean gameInProgress = true;
        while (gameInProgress) {
            int computerGuess = random.nextInt(minValue, maxValue+1);
            System.out.println("Computer guess is: " + computerGuess + "\nIf number is too big, enter - 1, " +
                    "too small - 2, same number - 0.");
            int userInput = scanner.nextInt();
            if (userInput==0) {
                System.out.println("Congratulations! You guessed number!");
                gameInProgress = false;
            } else if (userInput==1) {
                System.out.println("The number you guessed is too big!");
                maxValue = computerGuess - 1;
            } else if (userInput==2) {
                System.out.println("The number you guessed is too small!");
                minValue = computerGuess + 1;
            } else {
                System.out.println("Invalid input! Please, try again!");
            }
        }
    }
}

