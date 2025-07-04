package StringOperations;

public class StringMethod_indexOf_lastIndexOf_contains16 {
    public static void main(String[] args) {
        //indexOf()
        //Finds the first occurrence of a character or substring.
        //Returns the index (starting from 0), or -1 if not found.
        String str = "Hello Java World";
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("Python"));

        System.out.println();
        //lastIndexOf()
        //Finds the last occurrence of a character or substring.
        //Also returns the index or -1 if not found.
        String name = "Ganesh";
        System.out.println(name.lastIndexOf('n'));
        System.out.println(name.lastIndexOf("es")); //3

        System.out.println();
        //contains()
        //Checks if the string contains a given substring.
        //Returns true or false.
          String myFullName="Ganesh Vilas Gade";
        System.out.println(myFullName.contains("Ganesh"));
        System.out.println(myFullName.contains("Vaibhav"));
        System.out.println(myFullName.contains("g"));
    }
}
