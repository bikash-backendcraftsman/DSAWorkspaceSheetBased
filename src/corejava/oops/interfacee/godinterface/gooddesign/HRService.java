package corejava.oops.interfacee.godinterface.gooddesign;

public class HRService implements LeaveManageable,HiringManageable{
    @Override
    public void hireEmployee() {
        System.out.println("Hire Employee");
    }

    @Override
    public void fireEmployee() {
        System.out.println("Fire Employee");
    }

    @Override
    public void approveLeave() {
        System.out.println("Approve Leave");
    }

    /**
     * Note : It follows best design.
     *
     * ✔ Clean
     * ✔ Flexible
     * ✔ Testable
     * ✔ SOLID-compliant
     */
}
