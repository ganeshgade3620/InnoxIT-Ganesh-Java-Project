import java.util.Scanner;
public class Que6Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //write a java program to insert an element into a sorted array while maintaing its sorted order
        int[] numbers={1,2,3,5,6,7,8,9,10};
        System.out.print("enter the element to add: ");
        int element = sc.nextInt();//4
        int[]finalnumbers=new int[numbers.length+1];
        int index=0;
        boolean isElementInserted=false;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i+1]>element && isElementInserted==false) {
                finalnumbers[ index++]=numbers[i];
                finalnumbers[ index++]=element;
                System.out.println("element is added");
                isElementInserted=true;
            }
            else{
                finalnumbers[ index++]=numbers[i];
            }
        }
        System.out.println("after adding  elements are: ");
        for (int i=0;i<finalnumbers.length-1;i++){
            System.out.println(finalnumbers[i]);
        }
    }
}
