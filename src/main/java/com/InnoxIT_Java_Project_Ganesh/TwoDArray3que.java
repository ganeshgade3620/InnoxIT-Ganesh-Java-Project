import java.util.Scanner;
public class TwoDArray3que {
    //Take a matrix as input from the user.Search for a given number x and print the
    //indices at which it occurs.
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows length...");
        int rows=sc.nextInt();
        System.out.println("Enter columns length...");
        int cols=sc.nextInt();

        int[][] number=new int[rows][cols];

        //user input
        //rows
        for (int i=0;i<rows;i++){
            //columns
            for (int j=0;j<cols;j++){
                number[i][j]= sc.nextInt();
            }
        }

        int x=sc.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if (number[i][j]==x){
                    System.out.println("x found at locations("+ i +","+ j +")");
                }
            }

        }

    }
}
