import java.util.Scanner;
//write a java program take user input as string and print only the words that have an even number of characters.
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String[] arr=name.split(" ");
        for (int i=0;i<arr.length ;i++)
        {
            int len=arr[i].length();
            if (len%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
