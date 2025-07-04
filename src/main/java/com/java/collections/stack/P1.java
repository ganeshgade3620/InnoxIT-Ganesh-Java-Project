package com.java.collections.stack;
import java.util.*;
public class P1 {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after push(): " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop(): " + stack);

        System.out.println("Position of 'Banana': " + stack.search("Banana"));
        System.out.println("Position of 'Apple': " + stack.search("Apple"));
        System.out.println("Position of 'Mango': " + stack.search("Mango")); // Not in stack

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Stack elements:");
        for (String item : stack) {
            System.out.println(item);
        }
    }
}
