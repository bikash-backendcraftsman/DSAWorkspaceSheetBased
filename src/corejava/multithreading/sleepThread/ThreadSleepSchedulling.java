package corejava.multithreading.sleepThread;

public class ThreadSleepSchedulling {
    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        // Create 3 worker threads
        Thread worker1 = new Thread(new Worker("Worker-1"), "Worker-1");
        Thread worker2 = new Thread(new Worker("Worker-2"), "Worker-2");
        Thread worker3 = new Thread(new Worker("Worker-3"), "Worker-3");

        // Set thread priorities (for demonstration, though it's just a hint to scheduler)
        worker1.setPriority(Thread.NORM_PRIORITY);
        worker2.setPriority(Thread.NORM_PRIORITY);
        worker3.setPriority(Thread.NORM_PRIORITY);

        // Start all threads
        worker1.start();
        worker2.start();
        worker3.start();

        // Main thread continues execution
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(300); // Main thread sleeps for 300ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Main thread completed");
    }

    /**
     * Execution flow to understand How Thread Switching happend in case of sleep() method
     *
     * How Thread Scheduling Works with Thread.sleep():
     * 1.Thread States:
     *      RUNNABLE: Thread is ready to run
     *      TIMED_WAITING: When a thread calls sleep()
     *      RUNNING: Currently executing on CPU
     * 2.What Happens When a Thread Sleeps:
     *      The thread moves from RUNNING to TIMED_WAITING state
     *      The thread releases the CPU
     *      The JVM's thread scheduler selects another RUNNABLE thread to execute
     * 3.Scheduling Behavior:
     *      The JVM doesn't guarantee which thread will run next
     *      It's up to the OS thread scheduler
     *      Thread.sleep(0) can be used to hint the scheduler to switch threads
     * Example Output (order may vary):
     */
}
