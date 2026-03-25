package corejava.oops.abstraction.interfacedesign.badCode;

public class Main {
    public static void main(String[] args) {
        SearchJob job = new SearchJob();
        job.searchJobBasedOnType("japan");
    }

    /**
     * ❌ Bad Design Points
     *
     * Hard-coded concrete dependency
     * SearchJob directly creates SearchForJapan, causing tight coupling.
     *
     * Violation of Dependency Inversion Principle (DIP)
     * High-level logic depends on a low-level concrete class instead of an abstraction.
     *
     * Violation of Open/Closed Principle (OCP)
     * Any new job source (Germany, Remote, etc.) requires modifying this class.
     *
     * No interface / abstraction boundary
     * There is no contract to support multiple job-search strategies.
     *
     * Dead / unused method parameter
     * jobType is accepted but never used.
     *
     * Misleading method name (lying API)
     * searchJobBasedOnType suggests dynamic behavior, but behavior is fixed.
     *
     * String used as a control signal
     * String jobType is error-prone, not type-safe, and invites conditional logic.
     *
     * Single Responsibility Principle (SRP) violation
     * Class is responsible for orchestration and implementation selection.
     *
     * Object creation inside business class
     * Dependency is created internally instead of being injected.
     *
     * Impossible to substitute behavior at runtime
     * Strategy cannot be changed without editing the class.
     *
     * Poor testability
     * Cannot mock or fake SearchForJapan easily in unit tests.
     *
     * Tight coupling blocks reuse
     * SearchJob cannot be reused for other job-search contexts.
     *
     * No extension point for future requirements
     * Adding filters, regions, or providers will cause code explosion.
     *
     * Hidden assumption in design
     * Class assumes “Japan” forever, but method signature suggests flexibility.
     *
     * Encapsulation leak of decision logic
     * Decision of which job search to use is buried inside the class.
     */
}
