package com.InnoxIT_Java_Project_Ganesh.Collection_Framework;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    public class ReverseList {
        public static void main(String[] args) {
            List<String> fruits = new ArrayList<>();
            fruits.add("apple");
            fruits.add("banana");
            fruits.add("cherry");
            List<String> reversedFruits = new ArrayList<>();
            for (String fruit : fruits) {
                reversedFruits.add(new StringBuilder(fruit).reverse().toString());
            }

            System.out.println("Fruit names in reversed manner: ");
            for (String fruit : reversedFruits) {
                System.out.println(fruit);
            }

            System.out.println("Fruits in reverse order (reversed names):");
            for (int i = reversedFruits.size() - 1; i >= 0; i--) {
              System.out.println(reversedFruits.get(i));
            }
        }
}
