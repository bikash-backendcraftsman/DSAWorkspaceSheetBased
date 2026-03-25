package corejava.multithreading.sleepThread;

import java.time.LocalTime;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("Starting... " + LocalTime.now());

        try {
            // Sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current Thread :"+Thread.currentThread().getName());
        System.out.println("Current Thread Priority :"+Thread.currentThread().getPriority());
        System.out.println("After sleep... " + LocalTime.now());

    }
}
