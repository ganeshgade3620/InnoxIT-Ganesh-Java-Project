import java.util.Scanner;

public class FourSubCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Input marks for four subjects

        System.out.print("Enter marks for sub1: ");
        int sub1=sc.nextInt();

        System.out.print("Enter marks for sub2: ");
        int sub2= sc.nextInt();

        System.out.print("Enter marks for sub3: ");
        int sub3= sc.nextInt();

        System.out.print("Enter marks for sub4: ");
        int sub4= sc.nextInt();

        //check any subject is less than 35
        if (sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 < 35 ){
            System.out.println("Fail,please improve your skill");
        }
        else {
            //calculate the subject of  total marks and percentage
            double totalmarks = sub1 + sub2 + sub3 + sub4;
            double per = (totalmarks / 400.0) * 100;
            System.out.println("Percentage: " + per);

            //Determine class based on percentage
            if (per > 70) {
                System.out.println("Awesome! your in the  Distinction");
            }
            else if (per >= 60 && per <= 69.99) {
                System.out.println("very Good your in the first class");
            }
            else if (per >= 50 && per <= 59.99) {
                System.out.println("Good your in the second class");
            }
            else if ((per >= 35 && per <= 49.99)) {
                System.out.println("Your passed but please improve your knowledge");
            }
        }
        sc.close();
    }
}
