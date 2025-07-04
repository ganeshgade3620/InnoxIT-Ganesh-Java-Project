package StringOperations;

public class StringMethod_split11 {
    public static void main(String[] args) {
        //The split() method in Java is used to split a string into an array of substrings
        String str = "apple,banana,mango";
        String[] fruits = str.split(",");
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
    }
}
