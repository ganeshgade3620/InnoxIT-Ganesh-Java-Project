package com.java.bitwiseoperator;

public class P1 {
        public static void main(String[] args) {
            int a = 5;  // 0101
            int b = 3;  // 0011
        //64 32 16 8 4 2 1

            System.out.println("a & b = " + (a & b));  // 1 AND
            System.out.println("a | b = " + (a | b));  // 7  OR
            System.out.println("a ^ b = " + (a ^ b));  // 6  XOR
            System.out.println("~a = " + (~a));        // -6 NOT
            System.out.println("a << 1 = " + (a << 1));// 10  Left shift
            System.out.println("a >> 1 = " + (a >> 1));// 2  Right shift
            System.out.println("a >>> 1 = " + (a >>> 1));// 2  unsigned Right shift
        }
    }

