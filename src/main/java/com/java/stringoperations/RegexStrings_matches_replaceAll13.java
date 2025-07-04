package StringOperations;

public class RegexStrings_matches_replaceAll13 {
    public static void main(String[] args) {
        //	A regex is a sequence of characters that define a search pattern.
        //	It's mainly used for pattern matching with strings: validating formats (like email, phone numbers), searching, or replacing text.
       // match()
        String str = "hello123";
        boolean res = str.matches("[a-z]+\\d+"); // true
        System.out.println(res);

        //replaceAll()
        String str2 = "abc123xyz456";
        String result = str2.replaceAll("\\d+", "#"); // abc#xyz#
        System.out.println(str2);


    }
}
