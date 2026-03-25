package corejava.exceptionhandling.demo.overridingExceptionRule.rule3;


public class OnlinePaymentService extends PymentServiceRuleThree {

    // ✅ Case 1: Override with NO exception
    @Override
    public void processPayment() {
        System.out.println("Online payment processed");
    }

    /**
     * ✔️ Totally valid
     * ✔️ Subclass is safer than parent
     * ✔️ Liskov Substitution Principle is respected
     */
}
