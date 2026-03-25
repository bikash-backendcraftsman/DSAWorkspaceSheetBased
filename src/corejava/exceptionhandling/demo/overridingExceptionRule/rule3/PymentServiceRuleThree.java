package corejava.exceptionhandling.demo.overridingExceptionRule.rule3;

public class PymentServiceRuleThree {

    /**
     * ✅ Rule 3 (Re-stated Clearly)
     *
     * If a superclass method declares an unchecked exception, then the overriding method in the subclass:
     *
     * ✔️ Can declare any unchecked exception
     * ✔️ Can declare no exception at all
     * ❌ Cannot declare a new checked exception
     *
     * Why?
     * Because checked exceptions affect the caller’s contract, and unchecked ones do not.
     * @throws RuntimeException
     */

    //1️⃣ Base Example (Superclass declares unchecked exception)
    public void processPayment() throws RuntimeException {
        System.out.println("Processing payment...");
    }

    /**
     * Here:
     * 	•	RuntimeException → unchecked
     * 	•	Caller is not forced to handle it
     */


    //very important concept to focus and practice and retain the concept

    /**
     * 4️⃣ Real Project Scenario (Spring Boot – Service Layer)
     * Base Interface / Class
     * public interface CustomerService {
     *     Customer getCustomer(String id);
     * }
     *
     *
     * No checked exception declared.
     *
     * Implementation 1 (Valid – unchecked exception)
     * @Service
     * public class CustomerServiceImpl implements CustomerService {
     *
     *     @Override
     *     public Customer getCustomer(String id) {
     *         if (id == null) {
     *             throw new IllegalArgumentException("Customer ID cannot be null");
     *         }
     *         return new Customer(id);
     *     }
     * }
     *
     *
     * ✔️ Best practice
     * ✔️ Clean service API
     * ✔️ Works well with global exception handling
     *
     * ❌ Bad Implementation (Checked exception)
     * @Override
     * public Customer getCustomer(String id) throws SQLException {
     *     // ❌ Not allowed
     * }
     *
     *
     * This will not compile, because:
     *
     * Interface method didn’t declare SQLException
     *
     * Subclass cannot introduce checked exception
     *
     * 5️⃣ Why Java Enforces This Rule (Core Reason)
     * 🔒 Method Contract Safety
     *
     * Caller code:
     *
     * CustomerService service = new CustomerServiceImpl();
     * service.getCustomer("123"); // No try-catch expected
     *
     *
     * If subclass suddenly throws a checked exception:
     *
     * service.getCustomer("123"); // 💥 compiler now demands try-catch
     *
     *
     * 👉 Java prevents this breaking change
     *
     * 6️⃣ When Do We Convert Checked → Unchecked in Real Projects?
     *
     * This rule is why Spring Boot heavily prefers unchecked exceptions.
     *
     * Example: DAO Layer
     * try {
     *     jdbcTemplate.query(...);
     * } catch (SQLException e) {
     *     throw new DataAccessException("DB error", e);
     * }
     *
     *
     * Why convert?
     *
     * Service layer shouldn’t care about DB-specific exceptions
     *
     * Cleaner APIs
     *
     * Centralized handling
     *
     * 7️⃣ Spring Boot Global Exception Handling (How This Rule Fits)
     * Custom unchecked exception
     * public class CustomerNotFoundException extends RuntimeException {
     *     public CustomerNotFoundException(String msg) {
     *         super(msg);
     *     }
     * }
     *
     * Throw from service
     * if (customer == null) {
     *     throw new CustomerNotFoundException("Customer not found");
     * }
     *
     * Global Handler
     * @RestControllerAdvice
     * public class GlobalExceptionHandler {
     *
     *     @ExceptionHandler(CustomerNotFoundException.class)
     *     public ResponseEntity<String> handleNotFound(CustomerNotFoundException ex) {
     *         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
     *     }
     * }
     *
     *
     * ✔️ No checked exceptions
     * ✔️ No try-catch pollution
     * ✔️ Clean REST API
     * ✔️ Rule 3 respected automatically
     *
     * 8️⃣ Drawbacks if You Violate the Spirit of Rule 3
     *
     * Even if Java allows unchecked exceptions:
     *
     * ⚠️ Overusing unchecked exceptions can:
     *
     * Hide recoverable errors
     *
     * Make debugging harder if not logged properly
     *
     * Cause unexpected runtime crashes
     *
     * 👉 Solution:
     *
     * Unchecked exceptions for business & system failures
     *
     * Checked exceptions only at integration boundaries (rare in Spring)
     *
     * 9️⃣ Mental Model (Remember This Forever)
     *
     * Subclass must never force the caller to do more work than the superclass promised.
     *
     * Unchecked exceptions = caller’s responsibility at runtime
     * Checked exceptions = caller’s responsibility at compile time
     *
     * 🔥 One-Line Interview Answer
     *
     * If a superclass method declares an unchecked exception, the overriding method can declare unchecked exceptions or none,
     * but not checked ones, because checked exceptions change the method contract and break substitutability.
     */
}
