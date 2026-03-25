package corejava.oops.abstraction.interfacedesign.goodCode;

public class GermanyJobSearch implements JobSearchStrategy{
    @Override
    public void findJob(String jobType) {
        System.out.println("Searching " + jobType + " jobs in Germany...");
        // Germany-specific logic
    }
}
