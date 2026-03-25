package corejava.oops.abstraction.interfacedesign.goodCode;

public interface JobSearchStrategy {
    //1) Create the interface (contract)

    /**
     * 🎯 WHY Java enforces this
     *
     * Interfaces define a contract, not an implementation.
     *
     * A contract must be:
     *
     * Visible
     *
     * Callable
     *
     * Usable by any implementing class
     *
     * If methods were not public:
     *
     * Implementations couldn’t reliably expose behavior
     *
     * Polymorphism would break
     *
     */

    /**
     *
     * @param jobType
     */
    void findJob(String jobType);

    /**
     * Interface defines what we want: “find jobs”.
     * It doesn’t define how (Japan, Germany, etc.).
     */

    /**
     * Interfaces protect your code from change.
     * Implementations absorb change.
     */

    /**
     * WHEN TO USE INTERFACE
     * =====================
     *
     * 1️⃣1️⃣ INTERFACE THINKING MODEL (Use this daily)
     *
     * Before writing code, ask:
     *
     * Will this behavior change in future?
     *
     * Will there be multiple implementations?
     *
     * Is this a business capability or technical detail?
     *
     * Do I want to test this in isolation?
     *
     * Should caller care how it’s done?
     *
     * If answers lean YES → interface
     *
     * 🧠 WHEN to use interface methods
     * =================================
     *
     * Use interface methods when:
     *
     * You want multiple implementations
     *
     * You want runtime polymorphism
     *
     * You want dependency inversion
     *
     * You want mocking / testing flexibility
     *
     * ❌ Don’t use interface methods for:
     *
     * Helper logic
     *
     * Shared state logic
     *
     * Internal algorithms
     */
}
