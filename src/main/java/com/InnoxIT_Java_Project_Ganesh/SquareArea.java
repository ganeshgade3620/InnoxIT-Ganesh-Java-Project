import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //ask user to enter the side length of the square
        System.out.println("Enter the length of the side of the square: ");
        double side= sc.nextDouble();

        //calculate area using formula
        double area=side * side;

        //Display the result
        System.out.println("The area of the square is: "+area);
    }
}
