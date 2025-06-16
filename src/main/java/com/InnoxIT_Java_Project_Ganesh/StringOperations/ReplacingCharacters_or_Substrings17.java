package StringOperations;

public class ReplacingCharacters_or_Substrings17 {
    public static void main(String[] args) {
         //replace()
        // This is used to replace all occurrences of a character or substring with another.
        // It does not use regular expressions.
        String fruit = "apple";
        String result = fruit.replace('p', 'b');
        System.out.println(result);

        System.out.println();
        //replaceAll()
        //This method uses regular expressions (regex) to match and replace all matching patterns.
        String text = "a1b2c3";
        String res = text.replaceAll("[0-9]", "*");
        System.out.println(res);

        System.out.println();
        //replaceFirst()
        // Similar to replaceAll(), but it replaces only the first occurrence that matches the regex.
        String text2= "one two one two";
        String first = text2.replaceFirst("one", "ONE");
        System.out.println(first);
    }
}
