package designpatterns.creational.factory.notificationexample;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory=new NotificationFactory();

        Notification smsNotification=factory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser();

        Notification emailNotification= factory.createNotification(NotificationType.EMAIL);
        emailNotification.notifyUser();

        Notification pushNotification=factory.createNotification(NotificationType.PUSH);
        pushNotification.notifyUser();
    }
}
