package corejava.oops.abstraction.interfacedesign.goodCode;

public class SearchJobGoodCode {

    private final JobSearchStrategy strategy; // depends on interface

    public SearchJobGoodCode(JobSearchStrategy strategy){
        this.strategy = strategy;
    }

    public void searchJobBasedOnType(String jobType) {
        strategy.findJob(jobType);
    }

    /**
     * ✅ No new JapanJobSearch() inside.
     * ✅ You can switch behavior without changing SearchJob.
     * ✅ Easily testable (mock JobSearchStrategy).
     */
}
