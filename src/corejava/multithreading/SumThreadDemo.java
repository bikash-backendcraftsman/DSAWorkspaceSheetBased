package corejava.multithreading;

public class SumThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        SumThread thread1 = new SumThread(0,Integer.MAX_VALUE/2);
        SumThread thread2 = new SumThread((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

        long totalSum = thread1.getResult() + thread2.getResult();
        System.out.println("Total sum Value :"+totalSum);
        long endTime = System.currentTimeMillis();

        long totalTime = endTime - start;
        System.out.println("Total time taken by multiple thread :"+totalTime);
    }
}
