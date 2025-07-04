package StringOperations;

public class StringInterpolation_printf10 {
    public static void main(String[] args) {
        //displaying variables inside a string without concatenation, using format specifiers like %s, %d, and %f.
        String name = "Ganesh";
        int age = 23;
        double marks = 87.456;
        System.out.printf("Name: %s, Age: %d, Marks: %.2f%n", name, age, marks);// //Name: Ganesh, Age: 23, Marks: 87.46
    }
}
