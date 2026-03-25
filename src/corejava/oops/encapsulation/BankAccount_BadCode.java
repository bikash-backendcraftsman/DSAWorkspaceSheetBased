package corejava.oops.encapsulation;

public class BankAccount_BadCode {
    public int balance = 1000;

    public static void main(String[] args) {
        BankAccount_BadCode bd = new BankAccount_BadCode();
        bd.balance = -300;
    }

    /**
     * Problem
     * =======
     *
     * No validation
     *
     * No control
     *
     * Object state becomes invalid
     *
     * Anyone can modify anytime
     */

    /**
     * WITHOUT validation:
     * private field  → still unsafe
     *
     * WITH validation:
     * private field → controlled entry → invariant safe
     */
}
