package com.InnoxIT_Java_Project_Ganesh.Collection_Framework;
import java.util.*;
    public class ArrayListPractice1  {
        public static void main(String[] args) {

            // 1. Create a list
            List<String> fruits = new ArrayList<>();

            // 2. Add elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");

            // 3. Insert at specific index
            fruits.add(1, "Blueberry");  // Now: Apple, Blueberry, Banana, Cherry

            // 4. Update an element
            fruits.set(2, "Blackberry");  // Banana → Blackberry

            // 5. Remove elements
            fruits.remove(3);               // Removes "Cherry" (by index)
            fruits.remove("Apple");        // Removes "Apple" (by value)

            // 6. Get element by index
            String secondFruit = fruits.get(1);  // Blackberry

            // 7. Check if element exists
            boolean hasMango = fruits.contains("Mango");

            // 8. Iterate through list
            System.out.println("Using for loop:");
            for (int i = 0; i < fruits.size(); i++) {
                System.out.println(fruits.get(i));
            }

            System.out.println("Using enhanced for loop:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            System.out.println("Using iterator:");
            Iterator<String> iterator = fruits.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // 9. Get list size
            int size = fruits.size();

            // 10. Convert list to array
            String[] fruitArray = fruits.toArray(new String[0]);

            // 11. Sort list
            Collections.sort(fruits);

            // 12. Reverse list
            Collections.reverse(fruits);

            // 13. Sublist
            List<String> subList = fruits.subList(0, 1);  // First element only

            // 14. containsAll, addAll, removeAll, retainAll
            List<String> moreFruits = Arrays.asList("Mango", "Papaya", "Blackberry");
            boolean containsAll = fruits.containsAll(moreFruits);

            fruits.addAll(moreFruits);                          // Add all
            fruits.removeAll(Collections.singleton("Papaya"));  // Remove "Papaya"
            fruits.retainAll(Arrays.asList("Mango", "Blackberry")); // Keep only selected

            // 15. Check if list is empty
            boolean isEmpty = fruits.isEmpty();

            // 16. Clear list
            fruits.clear();

            System.out.println("Final List: " + fruits);  // Output: []
        }
    }

