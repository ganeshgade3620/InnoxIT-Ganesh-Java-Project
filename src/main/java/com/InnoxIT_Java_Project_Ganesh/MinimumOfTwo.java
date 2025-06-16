import java.util.Scanner;

public class MinimumOfTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //prompt the user to Enter the first number
        System.out.println("Enter the first number: ");
        int num1= sc.nextInt();

        //prompt the user to Enter the second number
        System.out.println("Enter the second number: ");
        int num2= sc.nextInt();

        double min;//declare a variable to store minimum value

        //Determine the minimum using if else
        if (num1<num2){
            min=num1;
        }
        else{
            min=num2;
        }
        //display the result
        System.out.println("The minimum of two number is: "+min);
    }
}
