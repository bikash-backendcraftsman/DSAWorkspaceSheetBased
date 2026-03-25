package corejava.multithreading;

public class SumThread  extends Thread{
    private int startIndex;
    private int intEndIndex;

    private long result;


    public SumThread(int startIndex, int intEndIndex) {
        this.startIndex = startIndex;
        this.intEndIndex = intEndIndex;
    }

    @Override
    public void run() {
        for(int i = startIndex;i<=intEndIndex;i++){
            result+=i;
        }
    }

    public long getResult(){
        return result;
    }
}
