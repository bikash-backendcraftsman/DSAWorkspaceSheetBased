package corejava.oops.abstraction.interfacedesign.goodCode;

public class JapanJobSearch implements JobSearchStrategy{
    @Override
    public void findJob(String jobType) {
        System.out.println("Searching " + jobType + " jobs in Japan...");
        // Japan-specific logic
    }
}
