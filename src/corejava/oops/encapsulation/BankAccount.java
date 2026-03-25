package corejava.oops.encapsulation;

//✅ Correct Encapsulation (With Boundary Validation)

public class BankAccount {
    private int balance;

    public void deposit(int amount) throws IllegalAccessException {
        if(amount <= 0){
            throw new IllegalAccessException("Invalid Amount");
        }
        balance+=amount;
    }

    public int withdraw(int amount){
        if(amount == 0 || amount > balance){
            throw new RuntimeException("Requested amount is invalid :"+amount);
        }
        balance=-amount;
        return balance;
    }

    //getters

    public int getBalance(){
        return balance;
    }


    /**
     * Why this is correct
     *
     * State is fully protected
     *
     * Rules enforced at boundary
     *
     * Object controls its own lifecycle
     *
     * Impossible to create invalid state
     */
}
