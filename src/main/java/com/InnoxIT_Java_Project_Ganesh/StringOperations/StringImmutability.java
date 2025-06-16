package StringOperations;

public class StringImmutability {
    public static void main(String[] args) {
        // Once a String object is created, it cannot be changed.
        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str); // Hello World

        //	str.concat(" World") creates a new String object "Hello World" because Strings are immutable.
        //The original "Hello" string still exists in memory
        //	str now points to the new object "Hello World".
        //The reference variable remains the same, but the object it points to changes.
    }
}
