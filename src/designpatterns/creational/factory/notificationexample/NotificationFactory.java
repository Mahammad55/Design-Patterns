package designpatterns.creational.factory.notificationexample;

public class NotificationFactory {
    public Notification createNotification(NotificationType type){
        switch (type){
            case SMS -> {
                return new SmsNotification();
            }
            case EMAIL -> {
                return new EmailNotification();
            }
            case PUSH -> {
                return new PushNotification();
            }
            default -> {
                return null;
            }
        }
    }
}
