package corejava.exceptionhandling.demo.overridingExceptionRule.rule3;

import java.io.IOException;

public class CryptoPaymentService extends PymentServiceRuleThree {

/*
    @Override
    public void processPayment() throws IOException { // ❌ compile-time error
        System.out.println("Online payment processed");
    }*/

    /**
     * 🚫 Compilation Error
     *
     * ❗ WHY is this not allowed?
     *
     * Because now:
     * 	•	Superclass promised: “You don’t need to handle checked exceptions”
     * 	•	Subclass breaks that promise
     * 	•	Caller code would suddenly be forced to add try-catch
     *
     * This violates method contract compatibility.
     */
}
