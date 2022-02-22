package designpatterns.game;

import java.util.Scanner;

public class ConsoleCommunication implements Communication {

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String receiveMessage() {
        return new Scanner(System.in).nextLine();
    }
}
