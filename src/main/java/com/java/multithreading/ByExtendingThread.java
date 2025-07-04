package com.java.multithreading;

public class ByExtendingThread extends Thread {

    public void run(){
        System.out.println("MyThread is runninng...");

    }
    public static void main(String[] args) {
        ByExtendingThread t1 = new ByExtendingThread();
        t1.start();
        System.out.println("Main thread is runnning...");


    }
}
