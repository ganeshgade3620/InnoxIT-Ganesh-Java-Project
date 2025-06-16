    import java.util.Scanner;

    public class TwoDAarrays2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int cols = sc.nextInt();


            int[][] numbers = new int[rows][cols];

            //input
            //rows
            for (int i = 0; i < rows; i++) {//2
                //column
                for (int j = 0; j < cols; j++) {//2
                    numbers[i][j] = sc.nextInt();
                }
            }
            //output
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
           boolean isElementFound = false;
            System.out.println("enter your element:");
            int element = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                System.out.println("I am still running...");
                for (int j = 0; j < cols; j++) {
                    if (numbers[i][j] == element) {
                        System.out.println("elemnt is found at this position " + i + " " + " " + j);
                        isElementFound = true;
                    }
                }
                if(isElementFound) {
                    break;
                }

            }
            if (isElementFound==false) {
                System.out.println("element is not found");
            }
            }
    }

