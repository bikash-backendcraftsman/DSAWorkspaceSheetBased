package corejava.multithreading.sleepThread;

import java.time.LocalTime;

public class ThreadSleepExamplesToUnderstandMore {

    public static void main(String[] args) {
        // Example 1: Simple Delay
        System.out.println("Example 1: Simple Delay");
        System.out.println("Start: " + LocalTime.now());
        sleepFor(2000);  // Sleep for 2 seconds
        System.out.println("End: " + LocalTime.now());

        // Example 2: Countdown Timer
        System.out.println("\nExample 2: Countdown Timer");
        countdown(5);

        // Example 3: Simulating Processing with Delay
        System.out.println("\nExample 3: Processing with Delay");
        processWithDelay(new String[]{"Task 1", "Task 2", "Task 3"});

        // Example 4: Rate Limiting
        System.out.println("\nExample 4: Rate Limiting");
        rateLimitedCalls(3, 1000);  // 3 calls per second

        // Example 5: Multiple Threads with Different Sleep Times
        System.out.println("\nExample 5: Multiple Threads");
        runMultipleThreads();
    }

    // Example 1: Simple Delay
    private static void sleepFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Sleep was interrupted");
        }
    }

    // Example 2: Countdown Timer
    private static void countdown(int seconds) {
        for (int i = seconds; i > 0; i--) {
            System.out.println("Countdown: " + i);
            sleepFor(1000);  // 1 second delay
        }
        System.out.println("Time's up!");
    }

    // Example 3: Simulating Processing with Delay
    private static void processWithDelay(String[] tasks) {
        for (String task : tasks) {
            System.out.println("Starting: " + task);
            sleepFor(1500);  // Simulate processing time
            System.out.println("Completed: " + task);
        }
    }

    // Example 4: Rate Limiting
    private static void rateLimitedCalls(int calls, long perMilliseconds) {
        long delay = perMilliseconds / calls;
        for (int i = 1; i <= calls * 2; i++) {  // Make twice as many calls to show rate limiting
            System.out.println("API Call #" + i + " at " + LocalTime.now());
            makeApiCall(i);
            sleepFor(delay);
        }
    }

    private static void makeApiCall(int callNumber) {
        // Simulate API call
        System.out.println("  Processing API call #" + callNumber);
    }

    // Example 5: Multiple Threads with Different Sleep Times
    private static void runMultipleThreads() {
        Thread fastThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Fast thread - Count: " + i);
                sleepFor(300);  // 300ms delay
            }
        }, "FastThread");

        Thread slowThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Slow thread - Count: " + i);
                sleepFor(1000);  // 1 second delay
            }
        }, "SlowThread");

        fastThread.start();
        slowThread.start();

        try {
            fastThread.join();
            slowThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads completed");
    }
}
