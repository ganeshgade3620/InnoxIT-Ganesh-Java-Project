package com.java.collections.Map;

    import java.util.*;
    public class P2 {
        public static void main(String[] args){
            Map<Integer,String> m1=new HashMap<>();
            m1.put(1,"Apple");
            m1.put(2,"Banana");
            m1.put(3,"Cherry");
            System.out.println("Map: " + m1);

            System.out.println("Value at 2: " + m1.get(2));
            System.out.println("Does Map contains key 3: " + m1.containsKey(3));
            System.out.println("Does Map contains value Cherry: " + m1.containsValue("Cherry"));

            m1.remove(1);
            System.out.println("Map after removing the first key: " + m1);
            System.out.println("Map key set: " + m1.keySet());
            System.out.println("Map values: " + m1.values());
            //putIfAbsent-add only if key is not already present
            m1.putIfAbsent(3,"Blueberry");
            System.out.println("Map after putIfAbsent: " + m1);

            //replace value for specific key
            m1.replace(2,"Dates");
            System.out.println("Map after replace: " + m1);

            m1.clear();
            System.out.println("Map after clear: " + m1);
        }
    }
