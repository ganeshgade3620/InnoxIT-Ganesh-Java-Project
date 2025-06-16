import java.util.Scanner;
public class Que2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int totalCharacters = 0;
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) != ' ') {
                totalCharacters++;
            }
            i++;
        }
        System.out.println("sum of total charcter name is: " + totalCharacters);
    }
}
