package com.java.multithreading;

public class ByImplementingRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable thread is running...");
    }
    public static void main(String[] args) {
        // Step 1: Create object of class implementing Runnable
        ByImplementingRunnable runnableObj = new ByImplementingRunnable();

        // Step 2: Create Thread object and pass runnableObj to it
        Thread thread = new Thread(runnableObj);

        // Step 3: Start the thread
        thread.start();

        // Main thread
        System.out.println("Main thread is running...");
    }
}
