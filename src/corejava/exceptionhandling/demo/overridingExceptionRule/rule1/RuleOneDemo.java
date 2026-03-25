package corejava.exceptionhandling.demo.overridingExceptionRule.rule1;

public class RuleOneDemo {
    public static void main(String[] args) {
        PaymentProcessing process = new OnlinePaymentProcessing();
        process.processPayment();
    }


    /**
     * Case                                                        Allowed?
     * Parent throws nothing → Child throws checked*               ❌ NO
     * Parent throws nothing → Child throws unchecked              ✅ YES
     * Parent throws checked → Child throws same/child             ✅ YES
     * Parent throws checked → Child throws broader                ❌ NO
     */

    /**
     * 🔹 The Rule (Plain English)
     *
     * If a superclass method does NOT declare any checked exception,
     * then the subclass overriding method CANNOT declare a checked exception.
     * But it CAN declare an unchecked (runtime) exception.
     *
     * Why?
     * Because polymorphism must remain safe.
     *
     * 🔹 First, quick reminder (very important)
     * ✅ Checked Exceptions
     *
     * Must be handled or declared
     *
     * Examples:
     *
     * IOException
     *
     * SQLException
     *
     * FileNotFoundException
     *
     * ✅ Unchecked Exceptions (Runtime)
     *
     * Not forced to handle
     *
     * Examples:
     *
     * NullPointerException
     *
     * IllegalArgumentException
     *
     * IllegalStateException
     *
     * 🔹 Simple Example (Rule Violation)
     * Superclass
     * class PaymentService {
     *     public void processPayment() {
     *         System.out.println("Processing payment");
     *     }
     * }
     *
     *
     * ⛔ This method declares NO exception
     *
     * ❌ Subclass (INVALID)
     * class OnlinePaymentService extends PaymentService {
     *
     *     @Override
     *     public void processPayment() throws IOException {
     *         System.out.println("Processing online payment");
     *     }
     * }
     *
     *
     * 🚫 Compile-time error
     *
     * Why?
     * Because now the caller suddenly has to handle IOException,
     * which the parent never promised.
     *
     * 🔹 Why Java Disallows This (Very Important Concept)
     * Polymorphism Example
     * PaymentService service = new OnlinePaymentService();
     * service.processPayment();
     *
     *
     * 👉 Caller thinks:
     *
     * “This method never throws checked exception.”
     *
     * But subclass suddenly throws one?
     * 💥 Contract broken
     *
     * Java protects the caller, not the subclass developer.
     *
     * 🔹 Correct Way – Use Unchecked Exception ✅
     * class OnlinePaymentService extends PaymentService {
     *
     *     @Override
     *     public void processPayment() {
     *         if (true) {
     *             throw new IllegalStateException("Payment gateway down");
     *         }
     *     }
     * }
     *
     *
     * ✔ Allowed
     * ✔ No compile-time issue
     * ✔ Caller not forced to handle
     *
     * 🔹 Real Project Scenario (Very Practical)
     * Base Service (Framework / Core Module)
     * public interface CustomerService {
     *     void createCustomer(Customer customer);
     * }
     *
     * Implementation (Business Logic)
     * public class CustomerServiceImpl implements CustomerService {
     *
     *     @Override
     *     public void createCustomer(Customer customer) {
     *         if (customer == null) {
     *             throw new IllegalArgumentException("Customer cannot be null");
     *         }
     *     }
     * }
     *
     *
     * 💡 Best practice:
     *
     * Use unchecked exceptions
     *
     * Let Global Exception Handler handle them
     *
     * 🔹 How to Handle This in Real Projects (BEST PRACTICES)
     * ✅ Option 1: Convert Checked → Unchecked (Most Used)
     * try {
     *     // IO / DB call
     * } catch (IOException e) {
     *     throw new RuntimeException("Failed to process payment", e);
     * }
     *
     *
     * Used in:
     *
     * Spring Boot
     *
     * Microservices
     *
     * REST APIs
     *
     * ✅ Option 2: Declare Checked Exception in Parent (If Needed)
     * class PaymentService {
     *     public void processPayment() throws IOException {
     *     }
     * }
     *
     *
     * Now subclass CAN declare same or child checked exception.
     *
     * ⚠ But this makes every caller handle it → noisy code
     *
     * ✅ Option 3: Use Custom Runtime Exception (Recommended)
     * public class PaymentFailedException extends RuntimeException {
     *     public PaymentFailedException(String message) {
     *         super(message);
     *     }
     * }
     *
     * throw new PaymentFailedException("Gateway timeout");
     *
     * 🔹 Drawbacks If Java Allowed Checked Exceptions in Override ❌
     * ❌ 1. Breaks Polymorphism
     * Parent p = new Child();
     * p.method(); // Suddenly throws exception
     *
     * ❌ 2. Forces Changes Everywhere
     *
     * Existing callers break
     *
     * Huge refactoring
     *
     * Unstable APIs
     *
     * ❌ 3. Makes Frameworks Impossible
     *
     * Spring
     *
     * Hibernate
     *
     * JPA
     *
     * They rely heavily on unchecked exceptions
     *
     * 🔹 Interview One-Liner (Very Powerful)
     *
     * “Overriding methods cannot throw broader checked exceptions because it would break polymorphism and violate the Liskov Substitution Principle.”
     *
     * 🔥 That’s senior-level talk.
     *
     * 🔹 Summary (Bookmark This)
     * Case	                                                  Allowed?
     * Parent throws nothing → Child throws checked	          ❌ NO
     * Parent throws nothing → Child throws unchecked	      ✅ YES
     * Parent throws checked → Child throws same/child	      ✅ YES
     * Parent throws checked → Child throws broader	          ❌ NO
     */
}
