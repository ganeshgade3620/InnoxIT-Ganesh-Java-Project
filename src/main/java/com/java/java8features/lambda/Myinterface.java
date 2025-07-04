package com.java.java8features.lambda;
@FunctionalInterface
public interface Myinterface {
        public void sayHello();

        default void sayHi() {
            System.out.println("Hi");
        }

        public static void sayBye(){
            System.out.println("Bye");
        }



    }
