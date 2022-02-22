package designpatterns.strategy;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message, Customer customer) {
        System.out.println("sent by email, to number: "
                + customer.getPhoneNumber()
                + " to client: " + customer.getFirstName()
                + " with message: " + message);
    }
}
