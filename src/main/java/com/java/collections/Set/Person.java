package com.java.collections.Set;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

class Person {
    private String aadharNumber;
    private String name;
    private int age;

    public Person(String aadharNumber, String name, int age) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.aadharNumber.equals(person.aadharNumber);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return aadharNumber.hashCode();
    }

    @Override
    public String toString() {
        return name + " (" + aadharNumber + ")";
    }
}
