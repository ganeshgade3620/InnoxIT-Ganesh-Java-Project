import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {

        //write a program to find cube of given number

        //create  a Scanner object to read user input
        Scanner sc=new Scanner(System.in);

        //prompt the user to Enter a number
        System.out.println("Enter a Number");
        int number=sc.nextInt();


        //calculate the cube of the number
         double cube=Math.pow(number,3);
        //display the result
        System.out.println("the cube of "+number+" is "+cube);

        //close the scanner
        sc.close();





    }
}