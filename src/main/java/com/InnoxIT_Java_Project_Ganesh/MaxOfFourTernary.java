import java.util.Scanner;

public class MaxOfFourTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input of four numbers

        System.out.println("Enter a first number: ");
        int a= sc.nextInt();

        System.out.println("Enter a second number: ");
        int b=sc.nextInt();

        System.out.println("Enter a third number: ");
        int c=sc.nextInt();

        System.out.println("Enter a fourth number: ");
        int d=sc.nextInt();

        //use ternary operator to find maximum
        int max=(a>b && a>c && a>d?a:b>c && b>d?b:c>d?c:d);
        System.out.println("The maximum number is:"+max);
        sc.close();
    }
}
