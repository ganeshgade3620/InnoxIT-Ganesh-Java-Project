import java.util.Scanner;

public class Que1String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String[] words = name.split(" "); // Split the sentence into words
       int totalCharacters=0;
        for (int i=0;i< words.length;i++) {
            System.out.println(words[i].length());
             totalCharacters=totalCharacters +words[i].length();
            }
        System.out.println("sum of total charcter name is: "+totalCharacters);
    }

    }
