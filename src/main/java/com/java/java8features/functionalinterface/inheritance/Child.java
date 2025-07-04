package com.java.java8features.functionalinterface.inheritance;

@FunctionalInterface
public interface Child extends Parent {
    default void print() {
        System.out.println("Child print");
    }
    public static void staticMethod() {
        System.out.println("Child static method");
    }
}
