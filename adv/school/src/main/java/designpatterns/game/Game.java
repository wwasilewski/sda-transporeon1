package designpatterns.game;

import java.util.Random;

public class Game {

    Communication communication;
    int limit = 100;

    public Game(Communication communication, int limit) {
        this.communication = communication;
        this.limit = limit;
    }

    public Game() {
    }

    private int randomNumber() {
        return new Random().nextInt(limit) + 1;
    }

    public void newGame() {
        int numberToGuess = randomNumber();
        int guess;
        communication.printMessage("guess a number 1-" + limit);

        do {
            guess = Integer.parseInt(communication.receiveMessage());
            if (guess == numberToGuess) {
                communication.printMessage("good");
            } else if (guess < numberToGuess && guess > 0) {
                communication.printMessage("number too low");
            } else if (guess > numberToGuess && guess <= limit) {
                System.out.println("number too high");
            } else {
                communication.printMessage("enter number 1-" + limit);
            }
        } while (guess != numberToGuess);
    }
}
