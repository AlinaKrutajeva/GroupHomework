package task2;

import java.util.Random;

public class NumberDetector {


    public static void main(String[] args) {

        Random randomVariable = new Random();
        int randomNumber = randomVariable.nextInt(101);
        System.out.println("Random Number is " + randomNumber);

        if (randomNumber < 10) {
            System.out.println("pass, try again");
        } else if ((randomNumber >= 20) && (randomNumber <= 40)) {
            System.out.println("pass, try again");
        } else if ((randomNumber >= 40) && (randomNumber <= 60)) {
            System.out.println("close but try again");
        } else if ((randomNumber >= 60) && (randomNumber <= 95)) {
            System.out.println("you are almost there");
        } else {
            System.out.println("correctly");
        }


    }
}
