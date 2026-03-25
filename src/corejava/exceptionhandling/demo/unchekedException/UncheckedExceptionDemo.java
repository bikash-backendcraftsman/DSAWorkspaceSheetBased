package corejava.exceptionhandling.demo.unchekedException;

import corejava.exceptionhandling.demo.checkedException.HTTPConnectChecked;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n Inside main..!!");

        share();
        System.out.println("\n End of main..!!");
    }

    private static void share(){
        System.out.println("/n Inside share method ..!");

        try {
            //risky code we have to write inside try block.
            HttpConnectUnchecked.send(-1, "hello", "http://goodsnips.com");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("/ End of share method..!");
    }
}
