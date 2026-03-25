package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

public class CloudFileService extends FileService {
    @Override
    public void readFileInformation(){
        throw new IllegalStateException("Cloud service unavailable");
    }
}
