package corejava.oops.abstraction.interfacedesign.badCode;

public class SearchJob {

    private final SearchForJapan searchJob = new SearchForJapan();

    void searchJobBasedOnType(String jobType){
        searchJob.findJob();
    }
}
