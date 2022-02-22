package designpatterns.strategy;

public class MobileNotification implements Notification {

    @Override
    public void sendNotification(String message, Customer customer) {
        System.out.println("sent by mobile, to number: "
                + customer.getPhoneNumber()
                + " to client: " + customer.getFirstName()
                + " with message: " + message);
    }
}
