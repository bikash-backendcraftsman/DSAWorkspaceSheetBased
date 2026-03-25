package corejava.oops.abstraction.goodDesign;

public class NotificationManagerImplementation {
    // ✅ LOOSE COUPLING ACHIEVED HERE
    // The class depends on an ABSTRACTION (NotificationService),
    // not on a concrete class like EmailNotification or SmsNotification.
    // NotificationManager does NOT know "which" implementation it is using.
    private final  NotificationService service;

    // ✅ DEPENDENCY IS INJECTED, NOT CREATED
    // NotificationManager does NOT do:
    //    new EmailNotification()
    // or new SmsNotification()
    // So this class is NOT tightly coupled to any implementation.
    NotificationManagerImplementation(NotificationService service) {
        //// ✅ DEPENDENCY STORED, NOT CREATED
        this.service = service;
    }

    void notifyUser(String message) {

        // ✅ BEHAVIOR-BASED INTERACTION
        // NotificationManager only knows:
        // "Someone can send a notification"
        // It does NOT know:
        // - how it is sent
        // - via email / SMS / push
        // - which protocol or API is used
        service.send(message);

        /**
         * Calls what to do
         *
         * Not how to do it
         *
         * 👉 This is the core of abstraction-based design.
         */

        // 👉 Because implementation details are hidden,
        // NotificationManager remains unchanged
        // even if notification logic changes completely.
    }

}
