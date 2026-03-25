package corejava.oops.abstraction.goodDesign;

import corejava.oops.abstraction.NotificationManager;

/**
 * 🔑 Final Summary (Tattoo-Level)
 *
 * Loose coupling is achieved because NotificationManager knows only the contract (NotificationService), not the concrete class.
 */
public class Application {
    public static void main(String[] args) {

        // ✅ DEPENDENCY CREATION (OUTSIDE)
        // Concrete class is chosen here

        /**
         *  // STEP 1: Choose the implementation
         *         // This decision is OUTSIDE NotificationManager
         *         // → keeps NotificationManager loosely coupled
         */
        NotificationService nService = new EmailNotification();
        //        ↑------------------------↑
        //        Interface reference     Concrete implementation

        // STEP 2: Inject the dependency
        // NotificationManager depends only on the interface
        NotificationManagerImplementation manager =
                new NotificationManagerImplementation(nService);

        // STEP 3: Use the behavior
        // NotificationManager has no idea how notification is sent
        manager.notifyUser("Welcome to the system!");


        /**
         * 📌 One-Line Rule (Repeat This)
         *
         * Abstraction achieves loose coupling by removing the need to know the concrete class.
         *
         * Or even sharper:
         *
         * If a class can be replaced without touching the caller → coupling is loose.
         */

        //Loose coupling happens when classes talk through contracts, not concrete classes. [Important]
    }
}
