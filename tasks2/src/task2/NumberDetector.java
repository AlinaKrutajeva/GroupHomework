package task2;

import java.util.Random;
import java.util.Scanner;

public class NumberDetector {


    public static void main(String[] args) {

        int copm;
        int user;
        int maxValue = 101;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean correct = false;
        copm = random.nextInt(maxValue) + 1;


        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 100: ");

            user = in.nextInt();

            if (user > copm) {
                System.out.println("Too high, try again");
            } else if (user < copm) {
                System.out.println("Too low, try again");
            } else {
                System.out.println(
                        "Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);
    }
}