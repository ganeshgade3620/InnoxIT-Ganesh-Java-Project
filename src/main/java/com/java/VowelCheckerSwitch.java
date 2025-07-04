import java.util.Scanner;

public class VowelCheckerSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Prompt user for input
        System.out.println("Enter a character: ");
        char ch=sc.next().toLowerCase().charAt(0);

        //check if the input character is vowels
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z')){
                    System.out.println(ch+ " is a consonant.");
                }
                else {
                    System.out.println("Invalid input.Please enter an alphabet character.");
                }
        }

    }
}
