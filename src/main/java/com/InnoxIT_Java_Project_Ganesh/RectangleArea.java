import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //ask user for the length of the reactagle
        System.out.println("Enter the length of the rectangle");
        double length= sc.nextDouble();

        //ask user for the width of the rectangle
        System.out.println("Enter the width of the rectangle: ");
        double width=sc.nextDouble();

        //calculate area using the formula
        double area=length * width;

        //display the result
        System.out.println("The area of the rectangle is: "+area);
    }
}
