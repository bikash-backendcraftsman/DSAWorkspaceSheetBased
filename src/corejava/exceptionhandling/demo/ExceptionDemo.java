package corejava.exceptionhandling.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("\n Inside main..!!");

        share();
        System.out.println("\n End of main..!!");
    }

    private static void share(){
        System.out.println("/n Inside share method ..!");

        try {
            //risky code we have to write inside try block.
            HttpConnect.send(0, "hello", "http://goodsnips.com");

        }catch (FileNotFoundException e) {
            //recovery code we have to write inside catch block.
            System.out.println("Exception handel for FileNotFound Exception");
            // A catch block can also throw an error.
            // throw e;

        } catch (IOException e) {
            System.out.println("Connecting to different Server..!!!");
            System.out.println("Exception Handel for IOException");
        } catch (Exception e){ }
        catch (Throwable th){}

        System.out.println("/ End of share method..!");
    }
}
