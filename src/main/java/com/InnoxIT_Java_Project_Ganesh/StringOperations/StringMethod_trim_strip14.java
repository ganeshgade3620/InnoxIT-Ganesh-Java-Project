package StringOperations;

public class StringMethod_trim_strip14 {
    public static void main(String[] args) {
        //trim() and strip() are used to remove whitespace from the beginning and end of a string
        //trim() only removes basic ASCII spaces, tabs, and newlines.
        //strip() removes all whitespace, including Unicode spaces that trim() misses.
        String str = "   Hello World   ";
        String res = str.trim();
        System.out.println(res); // "Hello World"

        String str2=" \t GANESH GADE  \n";
        String res2=str2.strip();
        System.out.println(res2);

        String str3="  \u2003 ganesh   ";
        String res3=str3.trim();
        String res4=str3.strip();
        System.out.println(res3);
        System.out.println(res4);

    }
}
