package designpatterns.observer;

public class Client implements Subscriber {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleNewsletter(String message) {
        System.out.println(name + " Got message: " + message);
    }
}
