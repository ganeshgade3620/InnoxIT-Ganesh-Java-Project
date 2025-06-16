public class StringnewString3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";                 // Reuses the same object from the pool
        String s3 = new String("Java");     // Creates a new object in the heap

        System.out.println(s1 == s2);       // true  (same reference in pool)
        System.out.println(s1 == s3);       // false (different objects)
        System.out.println(s1.equals(s3));  // true  (same value)

    }
}
