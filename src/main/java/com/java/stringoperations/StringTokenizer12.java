package StringOperations;
import java.util.StringTokenizer;
public class StringTokenizer12 {
    public static void main(String[] args) {
        //StringTokenizer is a class in Java that helps break a big string into smaller parts, called tokens
        String fruits = "apple,banana,mango";
        StringTokenizer st = new StringTokenizer(fruits, ",");

        while (st.hasMoreTokens()) {  //Checks if more tokens are available
            System.out.println(st.nextToken());//Returns the next token
        }
    }
}
