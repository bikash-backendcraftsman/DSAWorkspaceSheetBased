package corejava.oops.interfacee.AbstractImplementInterfaceDesign;

public abstract class AbstractPaymentprocessor implements PaymentProcessor {

    /**
     * ✔ Interface ensures consistency
     * ✔ Abstract class ensures reuse
     * ✔ Concrete class ensures specialization
     * @param amount
     */
    protected void preProcess(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Validated amount");
    }

    /**
     * 6️⃣ Does this break abstraction? ❌ NO
     * Why it’s safe:
     *
     * Interface still defines what must be done
     *
     * Abstract class only provides optional shared behavior
     *
     * Subclasses still must honor the contract
     *
     * No rules are violated.
     */
}
