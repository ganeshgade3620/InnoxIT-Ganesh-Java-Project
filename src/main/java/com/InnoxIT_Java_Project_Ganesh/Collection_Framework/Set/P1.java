package com.InnoxIT_Java_Project_Ganesh.Collection_Framework.Set;
import java.util.*;
public class P1 {
   // A Set is a collection that does not allow duplicate elements.
  //  It is unordered, meaning the elements are not stored in insertion order.
  //  Common implementations:
          //  HashSet – No order, fast performance.
        //    LinkedHashSet – Maintains insertion order.
        //   TreeSet – Stores elements in sorted order.
    public static void main(String[] args) {

        // Creating a Set using HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Second"); // duplicate, will be ignored

        // Displaying the set
        System.out.println("Set: " + set);

        // Removing an element
        set.remove("Frist");

        // Displaying after removal
        System.out.println("After removal: " + set);
    }
}
