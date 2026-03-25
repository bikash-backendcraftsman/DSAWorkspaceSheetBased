package corejava.oops.abstraction.goodDesign;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        // SMTP logic
        System.out.println("Send message through email");
    }
}
