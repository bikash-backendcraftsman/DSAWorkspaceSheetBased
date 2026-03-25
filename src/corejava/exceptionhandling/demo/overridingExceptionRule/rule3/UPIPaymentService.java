package corejava.exceptionhandling.demo.overridingExceptionRule.rule3;

public class UPIPaymentService extends PymentServiceRuleThree {

    //✅ Case 2: Override with another unchecked exception
    @Override
    public void processPayment() throws IllegalStateException {
        System.out.println("Online payment processed");
    }

    /**
     * ✔️ Valid
     * ✔️ IllegalStateException is unchecked
     * ✔️ Caller is still not forced to handle anything
     */
}
