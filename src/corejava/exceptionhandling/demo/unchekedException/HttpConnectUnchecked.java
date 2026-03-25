package corejava.exceptionhandling.demo.unchekedException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnectUnchecked {

    public static void send(int destination, String data,String partner) throws IOException {
        System.out.println("\n Inside send method .. !");

        //PreCondition
        if(destination < 0 || destination > 1){
            throw new IllegalArgumentException("Please provide proper destination value");
        }

        if(destination == 0){
            throw new FileNotFoundException();
        }else if(destination == 1){
            throw new IOException();
        }

        System.out.println("\n End of send method ..!");
    }
}
