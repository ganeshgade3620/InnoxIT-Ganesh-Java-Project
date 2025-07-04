//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false
package StringOperations;
public class Q1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nzmgara";
        isanagram(s, t);
        if (isanagram(s,t) && isanagram(t,s)){
            System.out.println("given string is anagram");
        }
        else {
            System.out.println("given string is not anagrams ");
        }
    }


    private static boolean isanagram(String s, String t) {
        if (s.length()!= t.length()){
        }

        boolean isanagram = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            isanagram = false;
            for (int j = 0; j < t.length(); j++) {
                if (ch == t.charAt(j)) {
                    isanagram = true;
                    break;
                }
            }
            if (isanagram == false) {
               // System.out.println("given string is not an anagram");
                break;
            }
        }
      //  if (isanagram==true) {
          //  System.out.println("given string is anagram string:");
       // }
        return isanagram;
    }

}
