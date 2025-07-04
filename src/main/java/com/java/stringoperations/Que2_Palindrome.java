package StringOperations;
import java.util.Scanner;
public class Que2_Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is not Palindrome");
        }
    }
}
