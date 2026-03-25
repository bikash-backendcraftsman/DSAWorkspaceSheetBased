package corejava.oops.interfacee;

public class RulesOfInterface {

    /**
     * Java interface is a pure contract — so some things are allowed, many are strictly NOT.
     *
     * 1️⃣ Can an interface contain variables?
     * ✅ YES — but with strict rules
     * interface Payment {
     *     int MAX_LIMIT = 10000;
     * }
     *
     * What really happens (implicit rules):
     *
     * public
     *
     * static
     *
     * final
     *
     * So this is actually:
     *
     * public static final int MAX_LIMIT = 10000;
     *
     * ❌ What is NOT allowed
     * interface Payment {
     *     int limit; // ❌ must be initialized
     * }
     *
     * 💡 Why?
     *
     * An interface cannot have instance state, so variables must be constants.
     *
     * 2️⃣ Can an interface contain a constructor?
     * ❌ NO — NEVER
     * interface Payment {
     *     Payment() { } // ❌ illegal
     * }
     *
     * 🔴 Why constructors are forbidden
     *
     * Constructor = initialize object state
     *
     * Interface = no object, no instance
     *
     * You cannot do new Payment()
     *
     * Mental rule:
     *
     * If something needs object creation → it does not belong in an interface
     *
     * 3️⃣ Can an interface contain instance state (fields)?
     * ❌ NO
     * interface User {
     *     String name; // ❌ instance variable not allowed
     * }
     *
     * 🔴 Why?
     *
     * Instance state means each object has its own data
     *
     * Interface has no objects
     *
     * Interface defines behavior, not state
     *
     * ✅ Allowed alternative
     *
     * Move state to implementation:
     *
     * class UserImpl implements User {
     *     private String name;
     * }
     *
     * 4️⃣ Can an interface extend another interface?
     * ✅ YES — and this is VERY IMPORTANT
     * interface Readable {
     *     void read();
     * }
     *
     * interface Writable {
     *     void write();
     * }
     *
     * interface ReadWrite extends Readable, Writable {
     * }
     *
     * 🔥 Key points
     *
     * Interface can extend multiple interfaces
     *
     * No diamond problem (no state)
     *
     * Used to build capability composition
     *
     * ❌ Interface CANNOT extend a class
     * interface A extends ArrayList {} // ❌ illegal
     *
     *
     * 6️⃣ How to think correctly (Design Mindset)
     *
     * Ask yourself 👇
     *
     * “Am I defining WHAT can be done, or HOW it is done?”
     *
     * WHAT → Interface
     *
     * HOW / STATE → Class
     *
     *
     * =====================
     *
     * 8️⃣ One-line Golden Rule 🧠
     *
     * Interface = behavior contract, zero state, zero construction logic
     */

    /**
     * 1️⃣ One-line responsibility difference (core idea)
     * Concept	Primary Responsibility
     * Interface	 : Define WHAT a class must do (capability / role / contract)
     * Abstract class :	Define WHAT a class is and share HOW it partially works (identity + base behavior)
     *
     * 👉 Interface = Role / Promise
     * 👉 Abstract class = Base identity with common behavior
     *
     * Keep this sentence in mind — everything else derives from it.
     *
     * ✔ Responsibility = define a contract [VERY VERY IMPORTANT]
     */
}
