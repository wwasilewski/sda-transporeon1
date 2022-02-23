package designpatterns.game;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int repeatGame;
        do {
            int numberToGuess = random.nextInt(11);
            System.out.println("picked number: " + numberToGuess);

            boolean isCorrect = false;
            int pickedNumber;

            while (!isCorrect) {
                System.out.println("pick a number 0-10: ");
                pickedNumber = sc.nextInt();

                if (pickedNumber == numberToGuess) {
                    isCorrect = true;
                } else if (pickedNumber < numberToGuess) {
                    System.out.println("number too low");
                } else if (pickedNumber > numberToGuess) {
                    System.out.println("number too high");
                }
            }
            System.out.println("correct, number was " + numberToGuess);
            System.out.println("play again? 1= YES, 0= NO");
            repeatGame = sc.nextInt();

        } while (repeatGame != 0);
    }
}
