package designpatterns.strategy;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification(String message, Customer customer) {
        System.out.println("sent by sms, to number: "
                + customer.getPhoneNumber()
                + " to client: " + customer.getFirstName()
                + " with message: " + message);
    }
}
