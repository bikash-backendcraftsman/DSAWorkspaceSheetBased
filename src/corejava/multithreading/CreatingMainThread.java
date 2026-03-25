package corejava.multithreading;

public class CreatingMainThread {
    public static void main(String[] args) {

        // Gets a reference to the current thread, which in this case
        // is the main thread.
       Thread ch = Thread.currentThread();

        System.out.println(ch.getName());
        try {
            for (int i = 5; i > 0; i--) {
                System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nFinished: " + ch.getName());
    }

    /**
     * Question : In my current class, why how main thread do execute code without calling run method? why? how it works?
     *
     * Answer:
     *How the Main Thread Works
     * Automatic Execution:
     * ====================
     *      When you run a Java program, the JVM automatically creates the main thread
     *      This is special behavior reserved only for the main method
     *
     * No Need for start():
     * ====================
     *      The main thread is the only thread that doesn't need start()
     *      The JVM automatically calls the main() method on this thread
     *
     * Single-Threaded by Default:
     * ==========================
     *      Unless you create additional threads, everything runs on the main thread
     *      All method calls from main() are part of the main thread's call stack
     */
}
