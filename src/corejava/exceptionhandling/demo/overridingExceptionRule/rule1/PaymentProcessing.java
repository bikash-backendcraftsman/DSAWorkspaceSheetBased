package corejava.exceptionhandling.demo.overridingExceptionRule.rule1;

import java.io.IOException;

//Super class
public class PaymentProcessing {

    /**
     * Rule 1: If the superclass method does not declare an exception,
     * then the overriding method in the subclass cannot declare a checked exception,
     * but can declare an unchecked exception.
     */

    public void processPayment() {
        System.out.println("Processing payment");
    }
}
