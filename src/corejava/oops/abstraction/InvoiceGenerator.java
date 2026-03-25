package corejava.oops.abstraction;
//Good Abstraction = Clear Behavior [method declaration] + Hidden Logic
//interface / abstract class → Abstraction
public interface InvoiceGenerator {
    void generateInvoice(String orderId); //[What does it do.]

    /**
     * ✔ Clear intent
     * ✔ Implementation flexible
     * ✔ Easy to change internally
     */

    /**
     * Example:
     * =======
     * private fields → Encapsulation
     *
     * interface / abstract class → Abstraction
     *
     * They work together, not against each other.
     */
}
