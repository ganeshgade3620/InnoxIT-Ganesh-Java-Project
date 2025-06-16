package String_Pro_Practice;

public class Anagram {
    public static boolean isAnagram(String s, String t){
        boolean isanagram = false;
        if (s.length()==t.length()) {

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                isanagram = false;

                for (int j = 0; j < t.length(); j++) {
                    if (t.charAt(j) == ch) {
                        isanagram = true;
                        break;
                    }
                    }
                if (isanagram==false){
                    break;





                }
            }
        }
        System.out.println(isanagram);
        return isanagram;
    }

    public static void main(String[] args) {
       String s="rat";
       String t="car";
       isAnagram(s,t);
       if (isAnagram(t,s) && isAnagram(s,t)){
           System.out.println("given string is are anagram");
       }
       else {
           System.out.println("given string is not an anagram");
       }
    }
}
