package com.java.collections.Queue;
import java.util.*;
public class P1 {

    //A Queue is a linear data structure that follows the FIFO principle (First In, First Out).
    //
    //The element that is added first will be removed first.
    //common methods int Queue:
    //  add()	Adds an element to the queue
    //  poll()	Removes and returns the head element
    // peek()	Returns the head element without removing
   // isEmpty()	Checks if the queue is empty
   // size()	Returns the number of elements

    //Real-life example:
   // First person in the line gets the ticket first and leaves the queue.
   // The second person becomes first, and so on.

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println(queue.poll());
        System.out.println("After removal: " + queue);
        queue.add("Fourth");
        System.out.println("After adding element: " + queue);
        System.out.println("return head element: " + queue.peek());
        System.out.println("Size of queue: " + queue.size());
        System.out.println("size of queue: " + queue.size());
    }
}
