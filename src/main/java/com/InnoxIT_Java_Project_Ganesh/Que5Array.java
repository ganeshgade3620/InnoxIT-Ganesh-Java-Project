import java.util.Scanner;

public class Que5Array {
    public static void main(String[] args) {

    //Take an array as input from the user.Search for a given number x and print the index at which it occurs.
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size:");
    int size= sc.nextInt();
    int[]number=new int[size];

    System.out.println("Enter your element");
    for (int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }
    System.out.println("Enter your search elemnt: ");
    int x= sc.nextInt();
    for (int i=0;i<number.length;i++){
        if (number[i]==x){
            System.out.println("x found at index: "+i);
        }
    }
}
}
