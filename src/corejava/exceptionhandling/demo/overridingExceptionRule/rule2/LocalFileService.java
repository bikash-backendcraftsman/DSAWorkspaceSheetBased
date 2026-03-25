package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

import java.io.IOException;

public class LocalFileService extends FileService {
    @Override
    public void readFileInformation() throws IOException {
        System.out.println("Reading Local file Data");

        //can throw same checked exception
    }
}
