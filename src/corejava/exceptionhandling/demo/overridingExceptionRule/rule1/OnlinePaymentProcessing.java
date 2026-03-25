package corejava.exceptionhandling.demo.overridingExceptionRule.rule1;

import java.io.IOException;

public class OnlinePaymentProcessing extends PaymentProcessing {

    // this is a rule violation in related to exception handling.

    /*@Override
    public void processPayment() throws IOException {
        System.out.println("Processing payment");
    }
}*/

    // But in the child class we can throw unchecked Exception.

    /**
     * ✔ Allowed
     * ✔ No compile-time issue
     * ✔ Caller not forced to handle
     */
    @Override
    public void processPayment(){
        System.out.println("In inheritance relation, sub class can throw unchecked Exception");
        if(true){
            throw new IllegalArgumentException("UncheckedException thrown. Unchecked Exception are cause because of programming flaws. " +
                    "No need to handel Unchecked Exception.");
        }

    }

}
