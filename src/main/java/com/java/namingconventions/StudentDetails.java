package com.java.namingconventions;// Package name (lowercase)

public class StudentDetails { // Class name (PascalCase)

    public static final int PASS_MARKS = 40; // Constant (ALL_UPPERCASE)

    private String studentName; // Variable name (camelCase)

    public StudentDetails(String studentName) { // Constructor
        this.studentName = studentName;
    }

    public void displayResult(int marks) { // Method name (camelCase)
        if (marks >= PASS_MARKS) {
            System.out.println(studentName + " has passed.");
        } else {
            System.out.println(studentName + " has failed.");
        }
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("Ganesh");
        s1.displayResult(55);
    }
}
