import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //get principal amount from user
        System.out.print("Enter principal amount: ");
        double principle= sc.nextDouble();

        //get rate of interest from user
        System.out.print("Enter the rate of interest(in %): ");
        double rate= sc.nextDouble();

        //get time(in years) from user
        System.out.print("Enter the time (in years): ");
        double time= sc.nextDouble();

        //calculate simple interest using the formula
        double si=(principle * rate * time) / 100;

        //Display the result
        System.out.println("Simple Interest is: "+si);
    }
}
