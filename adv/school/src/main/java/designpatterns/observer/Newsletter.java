package designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public class Newsletter {

    private List<Subscriber> subscribers = new LinkedList<>();

    public void sendMessage(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.handleNewsletter(message);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
