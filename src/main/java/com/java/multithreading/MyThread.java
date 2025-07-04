package com.java.multithreading;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is runninng");
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();// starts a new thread
        System.out.println("Main thread is running...");
    }

}
