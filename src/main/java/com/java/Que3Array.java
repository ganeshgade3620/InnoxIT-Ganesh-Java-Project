import java.util.Scanner;

public class Que3Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("enter the element to remove: ");
        int element = sc.nextInt();
        int[]finalnumbers=new int[9];
        int index=0;
        for (int i = 0; i < numbers.length+1; i++) {
            if (element == numbers[i]) {
                System.out.println("element is found in the list");
            }
            else{
                finalnumbers[index]=numbers[i];
                index++;
            }
        }
          System.out.println("after removing the elements are: ");
          for (int i=0;i<finalnumbers.length;i++){
            System.out.println(finalnumbers[i]);
        }
    }
}
