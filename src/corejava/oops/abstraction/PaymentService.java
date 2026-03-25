package corejava.oops.abstraction;

//Step 1: Define behavior (contract)

/**
 * ❌ Common Wrong Understanding
 *
 * “Abstraction hides behavior”
 *
 * This is wrong.
 *
 * If behavior were hidden:
 *
 * Caller wouldn’t know what the object can do
 *
 * Code would be unusable
 */
public interface PaymentService {
    void pay(double amount);

    /**
     * 👉 This tells:
     *
     * What it does → pay
     *
     * Not how it does it.
     *
     * Behaviour always tell what it does, not how it does. How is defined through implementation.
     */
}
