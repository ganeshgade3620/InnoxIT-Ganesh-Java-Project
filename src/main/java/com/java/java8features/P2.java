package com.java.java8features;

    // Step 1: Create an interface
    interface Animal {
        void sound();  // abstract method (no body)
        void eat();    // another abstract method
    }

    // Step 2: Create a class that implements the interface
    class Dog implements Animal {
        public void sound() {
            System.out.println("Dog barks");
        }

        public void eat() {
            System.out.println("Dog eats bones");
        }
    }

    // Step 3: Create main class to run the program
    public class P2 {
        public static void main(String[] args) {
            Dog myDog = new Dog();   // Create object of Dog class
            myDog.sound();           // Call sound method
            myDog.eat();             // Call eat method
        }
    }

