package StringOperations;

public class StringLiteral_vs_new_String {
    public static void main(String[] args) {
        String str1 = "Hello";
        //"Hello" is a string literal.
        // Stored in the String Constant Pool (String Pool).

        // If the same literal exists, Java reuses the existing object.
        String str2 = "Hello";

        System.out.println(str1);
        System.out.println(str2);

        //new object
        String str3 = new String("Hello");
	//Creates a new String object in the heap memory, even if the same string exists in the pool.

    }

}
