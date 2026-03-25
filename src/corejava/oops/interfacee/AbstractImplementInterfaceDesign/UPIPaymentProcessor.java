package corejava.oops.interfacee.AbstractImplementInterfaceDesign;

public class UPIPaymentProcessor extends AbstractPaymentprocessor{
    @Override
    public void processPayment(double amount) {
        preProcess(amount);
        System.out.println("Amount process successfully");
    }
}
