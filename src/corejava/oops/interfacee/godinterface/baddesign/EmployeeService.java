package corejava.oops.interfacee.godinterface.baddesign;

/**
 * Its a bad design when we have keep methods which are not related to Employee Service.
 *
 * 🚨 Why is this BAD design?
 * Problem	Why it hurts
 * ❌ Violates ISP	Clients depend on unused methods
 * ❌ Tight coupling	Changes ripple everywhere
 * ❌ Low cohesion	Unrelated responsibilities
 * ❌ Hard to test	Mocking becomes painful
 * ❌ Poor extensibility	Every new feature bloats interface
 *
 *
 * Now imagine:
 *=============*
 * ContractEmployee
 *
 * HRAdmin
 *
 * PayrollSystem
 *
 * All are forced to implement everything 😵‍💫
 */
public interface EmployeeService {
    void calculateSalary();
    void generatePayslip();
    void approveLeave();
    void hireEmployee();
    void fireEmployee();
    void assignProject();
    void generatePerformanceReport();
}
