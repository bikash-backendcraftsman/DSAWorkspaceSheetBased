package corejava.oops.interfacee.godinterface.gooddesign;

public class PayrollService implements SalaryCalculable{
    @Override
    public void calculateSalary() {
        System.out.println("Calculate Salary");
    }
}
