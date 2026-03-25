package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

import java.io.FileNotFoundException;

public class SecureFileService extends FileService {

    //Narrower checked exception
    @Override
    public void readFileInformation() throws FileNotFoundException {
        // FileNotFoundException ⊂ IOException
    }
}
