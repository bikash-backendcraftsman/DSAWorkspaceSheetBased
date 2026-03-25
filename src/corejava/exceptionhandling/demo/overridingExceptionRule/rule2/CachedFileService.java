package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

public class CachedFileService extends FileService {

    // No exception
    @Override
    public void readFileInformation(){
        // handled internally
    }
}
