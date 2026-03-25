package corejava.exceptionhandling.demo.checkedException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

    /**
     * Checked Exception we need to mandatorily we have to handel.
     * We can handel the checked exception By using try catch block or by propagating the exception.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\n Inside main..!!");

        share();
        System.out.println("\n End of main..!!");
    }

    private static void share(){
        System.out.println("/n Inside share method ..!");

        try {
            //risky code we have to write inside try block.
            HTTPConnectChecked.send(0, "hello", "http://goodsnips.com");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }

        System.out.println("/ End of share method..!");
    }
}
