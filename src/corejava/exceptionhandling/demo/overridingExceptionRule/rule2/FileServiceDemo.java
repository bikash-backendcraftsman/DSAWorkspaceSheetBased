package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

import java.io.IOException;

public class FileServiceDemo {
    public static void main(String[] args) {
        FileService fl = new LocalFileService();
        try {
            fl.readFileInformation();
        } catch (IOException e) {
            // We convert the checked Exception to Unchecked Exception.
            throw new RuntimeException(e);
        }
    }
}
