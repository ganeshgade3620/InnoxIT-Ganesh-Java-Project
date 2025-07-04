package com.java.java8features;

// Create  interface
interface Animals {
    void sound();//abstract
    void eat();

    // Default method in interface
    default void sleep() {
        System.out.println("Animal is sleeping (default behavior)");
    }
}

//  Create a class that implements  interface
public class Dogs implements Animals {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }

    // No need to override default method
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        myDog.sound();
        myDog.eat();
        myDog.sleep();             // Uses default method from interface
    }

    }

