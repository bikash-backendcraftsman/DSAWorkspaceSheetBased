package corejava.oops.abstraction.goodDesign;

public class PushNotification implements NotificationService {
    @Override
    public void send(String message) {
        // FCM / APNS logic
    }

}
