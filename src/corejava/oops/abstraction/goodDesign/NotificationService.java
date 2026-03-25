package corejava.oops.abstraction.goodDesign;

//✅ Step 1: Create an Abstraction (Behavior Only)
public interface NotificationService {
    void send(String message);

    /**
     * ✔ Clear behavior
     * ✔ No implementation detail
     */
}
