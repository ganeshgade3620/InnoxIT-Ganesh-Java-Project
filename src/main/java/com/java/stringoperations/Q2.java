package StringOperations;
import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {

        String s = "rat";
        String t = "car";
        if(s.length ()!=t.length ()){
            System.out.println ("two strings length are diffrent so not an anagram");
        }else {
            char[]ch1=s.toCharArray ();
            char[]ch2=t.toCharArray ();
            Arrays.sort (ch1);
            Arrays.sort (ch2);
            if(Arrays.equals (ch1,ch2)){
                System.out.println ("GIVEN STRINGS ARE ANAGRAM");
            }
            else {
                System.out.println ("GIVEN STRINGS ARE NOT ANAGRAM");
            }
        }
    }
}