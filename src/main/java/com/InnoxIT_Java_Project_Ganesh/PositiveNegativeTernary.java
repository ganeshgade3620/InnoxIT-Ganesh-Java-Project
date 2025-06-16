import java.util.Scanner;

public class PositiveNegativeTernary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //ask user to enter a number
        System.out.print("Enter a number: ");
        int number= sc.nextInt();

        //use ternary operator to check if the number is positive or negative
        String result=(number>=0)?"Positive":"Negative";

        //Display the result
        System.out.println("The number is: "+result);

        sc.close();

    }
}
