package String_Pro_Practice;

import java.util.Arrays;

public class Anagram_Logic_2 {
    public static void main(String[] args) {

        String s="rat";
        String t="car";

        if (s.length()!=t.length()){
            System.out.println("given string are not anagram");
        }
        else {
            char[]ch1=s.toCharArray();
            char[]ch2=t.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2)){
                System.out.println("given String are  anagram string");
            }
            else {
                System.out.println("given string are not anagram ");
            }

        }
    }
}
