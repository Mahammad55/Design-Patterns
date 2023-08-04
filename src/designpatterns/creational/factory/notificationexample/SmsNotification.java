package designpatterns.creational.factory.notificationexample;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a Sms notification");
    }
}
