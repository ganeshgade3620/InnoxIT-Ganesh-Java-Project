package com.java.oops.classandobjectdemo;
public class OppsDemo {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "red";
        System.out.println(p.color);
        p.writetype();
        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type="gel";
        System.out.println(p2.color);
        p2.writetype();
    }
}
