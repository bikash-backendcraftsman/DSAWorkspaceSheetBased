package corejava.oops.abstraction;
//❌ Tight Coupling (Bad Design)
public class NotificationManager {

    EmailService service = new EmailService();
    void notifyUser(String message){
        service.sendEmail(message);
    }

    public static void main(String[] args) {
        NotificationManager mn = new NotificationManager();
        mn.notifyUser("Bikash");
    }

    /**
     * Very Very Important Point
     * =========================
     *
     * ❌ Problems
     *
     * Knows EmailService
     *
     * Knows how email is sent
     *
     * To add SMS → modify this class
     *
     * Violates Open–Closed Principle
     *
     * 🔑 Key Insight Before Fixing
     *
     * Ask yourself:
     *
     * “Do I care how notification is sent, or just that it is sent?”
     *
     * 👉 You only care about the behavior: send notification
     */
}
