package corejava.oops.interfacee;

/**
 * 👉 Human = identity [When we talk about Identity go for abstract class]
 * 👉 Employee = identity (business identity)
 * 👉 Driver = capability [When we talk about capability go for interface]
 */
public class Choose_Abstract_Versus_Interface {

    /**
     * 7️⃣ Now the BIG question: When to choose what?
     * ✅ Choose ABSTRACT CLASS when:
     *
     * Ask yourself:
     *
     * “Is this a base concept in my domain?”
     *
     * “Do all subclasses share state?”
     *
     * “Do I want to protect invariants?”
     *
     * Examples:
     *
     * BankAccount
     *
     * Employee
     *
     * Order
     *
     * Vehicle
     *
     * Payment
     *
     * ✅ Choose INTERFACE when:
     *
     * Ask yourself:
     *
     * “Is this something many unrelated classes can do?”
     *
     * “Is this a role/capability?”
     *
     * “Do I want loose coupling?”
     *
     * Examples:
     *
     * Taxable
     *
     * Auditable
     *
     * Notifiable
     *
     * Payable
     *
     * Runnable
     *
     * 8️⃣ When to use BOTH together (this is enterprise design)
     *
     * This is very important for business systems.
     *
     * Example: Employee system (real business)
     * Identity (abstract class)
     * abstract class Employee {
     *     protected double salary;
     * }
     *
     * Capabilities (interfaces)
     * interface Taxable {
     *     double calculateTax();
     * }
     *
     * interface BonusEligible {
     *     double calculateBonus();
     * }
     *
     * Concrete class
     * class FullTimeEmployee extends Employee implements Taxable, BonusEligible {
     *     public double calculateTax() {
     *         return salary * 0.2;
     *     }
     *
     *     public double calculateBonus() {
     *         return salary * 0.1;
     *     }
     * }
     *
     * Why this design is powerful
     *
     * Employee = identity
     *
     * Taxable = government rule
     *
     * BonusEligible = HR rule
     *
     * Mix & match without breaking hierarchy
     */
}
