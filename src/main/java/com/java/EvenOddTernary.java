import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Ask user to Enter a number:
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        //Determine if the number is even or odd using ternary operator
        String  result=(number % 2==0)?"even":"odd";

        //Display the result
        System.out.println("The number "+number+" is "+result);
        sc.close();
    }
}
