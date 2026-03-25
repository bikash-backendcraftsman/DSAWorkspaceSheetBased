package corejava.multithreading.sleepThread;

public class Worker implements Runnable{
    private String name;

    public Worker(String name){
        this.name = name;
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
       for(int i = 0;i<3;i++){
           System.out.println(name+" is working "+i);
           try {
               // Each worker sleeps for a different duration
               int time = (int)(Math.random() * 300);
               System.out.println(name+" sleep for : "+time + 200);

               Thread.sleep(200 + (int)(Math.random() * 300));
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
               return;
           }
       }
        System.out.println(name + " has finished its work");
    }
}
/**
 * Key Points:
 * 1.Cooperative Multitasking:
 *      sleep() is a cooperative way for a thread to yield control
 *      The thread voluntarily gives up its time slice
 * 2.No Guaranteed Order:
 *      The order of thread execution isn't guaranteed
 *      The OS scheduler makes the final decision
 * 3.CPU Usage:
 *      Sleeping threads don't consume CPU
 *      Other threads can use the CPU while one is sleeping
 * 4.Preemptive vs Cooperative:
 *      Java uses preemptive scheduling (OS can interrupt threads)
 *      But sleep() is a cooperative mechanism
 * Thread Priorities:
 *      Can influence scheduling but aren't guarantees
 *      Higher priority threads are more likely to run, but not certain
 */

/**

/**
 * Note:
 *
 * Thread.sleep() affects thread scheduling in Java.
 * The key takeaway is that sleeping allows other threads to run,
 * but the exact order isn't guaranteed and depends on the JVM and OS scheduler.
 */