package corejava.multithreading;

public class ThreadWithRunnable {
    public static void main(String[] args) throws InterruptedException {

        Runnable rn = ()-> {
            System.out.println("Business task created");
            int result = 0;
            for(int i =0; i < 5;i++){
                result+=i;
                System.out.println("Processing step :"+i);
            }
            System.out.println("Task Completed :"+result);
        };
        Thread th = new Thread(rn);

        th.start();
        th.join();

        System.out.println("Accessing all Thread methods to get it more clarity");
        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name :"+currentThread.getName());
        System.out.println("Thread Id :"+currentThread.getId());

    }

    /**
     * Thread Basics Summary
     * =====================
     * Main Thread
     *      Created automatically by JVM
     *      Named "main"
     *      Entry point of any Java program
     * Creating New Threads
     *
     *      Extend Thread class or implement Runnable
     *      Default naming: "Thread-N" (N starts from 0)
     *      Can set custom names with setName() or constructor
     * Thread.currentThread()
     *
     *      Returns the currently executing thread
     *      Each thread has its own context
     *      Output depends on which thread executes it
     * Thread Behavior
     *      Threads run concurrently
     *      Execution order is non-deterministic
     *      Each has its own stack and program counter
     *      Main thread ends when main() completes (unless daemon threads are running)
     * Key Methods
     *      start(): Begins thread execution
     *      run(): Contains thread's code
     *      join(): Waits for thread to complete
     *      currentThread(): Gets current thread reference
     * Thread Naming
     *      Helpful for debugging
     *      Set via setName() or constructor
     *      Default: "Thread-0", "Thread-1", etc.
     * Thread Lifecycle
     *      New → Runnable → Running → Terminated
     *      Can be in waiting/timed_waiting/blocked states
     * Best Practices
     *      Always name your threads
     *      Use Runnable over extending Thread
     *      Be mindful of thread safety
     *      Use join() when you need to wait for thread completion
     * Feedback submitted
     *
     */
}
