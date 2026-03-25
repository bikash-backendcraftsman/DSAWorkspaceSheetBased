package corejava.oops.abstraction;

//Step 2: Hide implementation
public class CreditCardPayment implements PaymentService{
    @Override
    public void pay(double amount) {
        /**
         * Internal Implementation
         */

        // validation
        // encryption
        // API call
        // logging

        System.out.println("Paying through Credit Card");
    }

    public static void main(String[] args) {
        PaymentService service = new CreditCardPayment();
        service.pay(200);

        /**
         * When we call service.pay(200), how internally it got executed we dont know.
         *
         * ❌ Caller does NOT know:
         *=========================
         * How validation works
         * How encryption is done
         * Which gateway is used
         */
    }
}
