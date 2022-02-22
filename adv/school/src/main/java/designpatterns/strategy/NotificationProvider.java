package designpatterns.strategy;

public class NotificationProvider {

    public Notification getNotification(String preferedContact) {
        if (preferedContact.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if (preferedContact.equalsIgnoreCase("mobile")) {
            return new MobileNotification();
        }
        return new EmailNotification();
    }
}
