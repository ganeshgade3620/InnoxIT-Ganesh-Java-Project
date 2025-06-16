package StringOperations;

public class StringComparison6 {
    public static void main(String[] args) {
        //== Checks whether two references point to the same object in memory.
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // true (same object in String Pool)

        String s3 = new String("Java");
        System.out.println(s1 == s3); // false (different memory location)

        System.out.println();
        //equals()
      //  Checks whether the contents of the strings are equal, regardless of memory location
        String e1 = "Java";
        String e2 = new String("Java");
        System.out.println(e1.equals(e2)); // true
    }


}
