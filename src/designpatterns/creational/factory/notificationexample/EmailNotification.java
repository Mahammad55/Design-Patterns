package designpatterns.creational.factory.notificationexample;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an E-main notification");
    }
}
