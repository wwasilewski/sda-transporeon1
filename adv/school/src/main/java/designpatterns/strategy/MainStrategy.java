package designpatterns.strategy;

import java.util.List;

public class MainStrategy {
    public static void main(String[] args) {
        Customer customer1 = new Customer("aaa", "111", "11@awp.pl", "sms");
        Customer customer2 = new Customer("bbb", "222", "22@awp.pl", "email");
        Customer customer3 = new Customer("ccc", "333", "33@awp.pl", "mobile");

        List<Customer> clients = List.of(customer1, customer2, customer3);
        sendNotifications("test message", clients);
    }

    private static void sendNotifications(String message, List<Customer> clients) {
        NotificationProvider notificationProvider = new NotificationProvider();
        clients.forEach(customer -> notificationProvider.getNotification(customer.getPreferredContact())
                .sendNotification(message, customer));
    }
}
