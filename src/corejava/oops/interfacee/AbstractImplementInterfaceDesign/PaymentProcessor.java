package corejava.oops.interfacee.AbstractImplementInterfaceDesign;

public interface PaymentProcessor {

    void processPayment(double amount);

    /**
     * 9️⃣ JDK examples (VERY IMPORTANT)
     * Runnable + Thread
     * class MyThread extends Thread { }   // Thread implements Runnable
     *
     *
     * Runnable → contract
     *
     * Thread → partial implementation
     *
     * Collections Framework
     * AbstractList implements List
     * AbstractMap implements Map
     *
     *
     * This is exactly the same pattern.
     *
     * 🔟 Interview Trick Question (they love this)
     *
     * Q: If abstract class already implements interface, why not skip interface?
     *
     * ✅ Correct answer:
     *
     * Interface defines role / capability
     * Abstract class defines reusable behavior
     * They solve different problems
     *
     * 🔁 Mental Shortcut (remember this)
     *
     * Interface → “What promise must I keep?”
     * Abstract class → “What can I reuse while keeping that promise?”
     *
     * ✅ Final Verdict
     *
     * ✔ Yes, abstract class can implement interface
     * ✔ No, it does NOT break anything
     * ✔ Yes, it’s a best practice when:
     *
     * contract + shared behavior both exist
     * ✔ Used heavily in JDK, Spring, Hibernate
     */
}
