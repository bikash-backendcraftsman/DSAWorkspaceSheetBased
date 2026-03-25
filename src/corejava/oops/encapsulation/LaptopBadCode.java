package corejava.oops.encapsulation;

public class LaptopBadCode {
    private String memory;
    private String ram;

    //constructor to initialize the object
    public LaptopBadCode(String memory, String ram){
          this.memory = memory;
          this.ram = ram;
    }

    public String getMemory(){
        return memory;
    }

    public String getRam(){
        return ram;
    }

    public static void main(String[] args) {
        LaptopBadCode lp = new LaptopBadCode("null","null");
        String memory1 = lp.getMemory();
        System.out.println(memory1);
        String ram1 = lp.getRam();
        System.out.println(ram1);
    }

    /**
     *  its is a bad code related to encapsulation because:
     *
     *  Why this Laptop design is BAD (points only):
     *  ===========================================
     *
     * No validation at object creation
     *
     * "null" (invalid value) is accepted, so the object is born in an invalid state.
     *
     * Constructor does not protect invariants
     *
     * There is no rule defining what a valid memory or ram is.
     *
     * String used for technical properties
     *
     * memory and ram should be numeric (e.g., GB), not free-form String.
     *
     * Semantic confusion between "null" and null
     *
     * "null" is a valid string but represents an invalid real-world value.
     *
     * Object allows meaningless states
     *
     * A laptop with "null" memory or RAM makes no business sense.
     *
     * No encapsulation of business rules
     *
     * The class does not control or enforce its own correctness.
     *
     * Getters expose invalid internal state
     *
     * Callers can freely read corrupted data.
     *
     * Constructor blindly trusts caller
     *
     * Responsibility of correctness is pushed outside the object.
     *
     * No future-proofing
     *
     * Any additional logic (upgrade RAM, validate memory size) will require breaking changes.
     *
     * Acts as a data holder, not a domain object
     *
     * This is effectively a DTO, not a properly encapsulated model.
     *
     * Violates “fail fast” principle
     *
     * Errors surface late instead of at object creation.
     *
     * Hard to test correctness
     *
     * No single place defines what “valid Laptop” means.
     *
     * Encourages anemic domain model
     *
     * Behavior and rules will move to external services.
     *
     * No defensive programming
     *
     * The class cannot defend itself from misuse.
     *
     * Misleads developers
     *
     * Looks safe due to private fields but is actually unsafe.
     *
     * Core takeaway:
     *
     * private + constructor + getters ≠ encapsulation
     * Encapsulation fails because the object cannot guarantee its own validity.
     */
}
