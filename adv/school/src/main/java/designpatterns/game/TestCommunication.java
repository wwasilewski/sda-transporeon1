package designpatterns.game;

public class TestCommunication implements Communication {

    @Override
    public void printMessage(String message) {

    }

    @Override
    public String receiveMessage() {
        return "50";
    }
}
