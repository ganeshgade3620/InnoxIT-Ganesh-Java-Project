package com.java.java8features;

public class P1 {

    interface InterfaceName {
        // abstract method
        void methodName();

        // default method (Java 8+)
        default void defaultMethod() {
            System.out.println("Default method");
        }
    }

}
