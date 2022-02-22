package designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        newsletter.addSubscriber(new Client("Adam"));
        newsletter.addSubscriber(new Client("Anna"));
        newsletter.addSubscriber(new Client("Maria"));

        newsletter.sendMessage("Hello");
    }
}
