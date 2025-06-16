package StringOperations;

public class Que1_Reverse {
    public static void main(String[] args) {
        //Reverse a String without using built-in functions
        String name="Ganesh gade";
         String rev="";
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
