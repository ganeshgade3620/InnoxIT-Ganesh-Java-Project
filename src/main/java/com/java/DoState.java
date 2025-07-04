import java.util.Scanner;

public class DoState {

    private static void doStatement() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu:");
        System.out.println("1.Pizza: $12");
        System.out.println("2.Burger:$8");
        System.out.println("3.Coffee:$2");
        System.out.println("4.Tea:$1");
        System.out.println("5:Cake:$5");

        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        while (choice < 1 || choice > 5) {
            System.out.println("Menu:");
            System.out.println("1.Pizza: $12");
            System.out.println("2.Burger:$8");
            System.out.println("3.Coffee:$2");
            System.out.println("4.Tea:$1");
            System.out.println("5:Cake:$5");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

        }
        System.out.println("placing order");


        do {
            System.out.println("Menu:");
            System.out.println("1.Pizza: $12");
            System.out.println("2.Burger:$8");
            System.out.println("3.Coffee:$2");
            System.out.println("4.Tea:$1");
            System.out.println("5:Cake:$5");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }
        while (choice < 1 || choice > 5);
        System.out.println("placing order ");
    }
    public static void main(String[] args) {
         doStatement();
    }
}
