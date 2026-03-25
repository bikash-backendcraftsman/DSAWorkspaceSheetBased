package corejava.oops.interfacee.AbstractImplementInterfaceDesign;

public class CardPayment extends AbstractPaymentprocessor{
    @Override
    public void processPayment(double amount) {
        preProcess(amount);
        System.out.println("Processing Card payment");
    }
}
