import java.util.Scanner;

public class Circle {

    //write a progrm to find area of circle
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner sc=new Scanner(System.in);

       //prompt the user to Enter the radius
        System.out.println("Enter the radius: ");
        double radius=sc.nextDouble();

        //calculate the area of the circle
        double area=Math.PI * radius * radius;
   //   double area=Math.PI*(Math.pow(radius,2));

        //display the result
        System.out.println("area of the circle is "+area);

        //close the Scanner
        sc.close();

    }
}
