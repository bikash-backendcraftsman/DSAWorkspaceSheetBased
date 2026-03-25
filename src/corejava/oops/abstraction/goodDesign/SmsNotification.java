package corejava.oops.abstraction.goodDesign;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        // SMS gateway logic
    }
}
