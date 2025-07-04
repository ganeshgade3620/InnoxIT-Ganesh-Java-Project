package com.java.collections.Set;

import java.util.HashSet;
import java.util.Set;

    public class EqualsHashEx {
        public static void main(String[] args) {
            Set<Person> set = new HashSet<>();

            Person p1 = new Person("123456789012", "Snehal", 23);
            Person p2 = new Person("123456789012", "Snehal", 23);  // same Aadhar
            Person p3 = new Person("999999999999", "Aishwarya", 25);    // different Aadhar

            set.add(p1);
            set.add(p2);  // Will NOT be added (duplicate based on Aadhar)
            set.add(p3);

            System.out.println("Unique persons in set:");
            for (Person p : set)
                System.out.println(p);
        }
    }
