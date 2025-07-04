import java.util.Scanner;

public class SumOfFiveDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Prompt user until a valid string of at least five characters is entered
        do {
            System.out.print("Enter a string with at least five characters: ");
            input = scanner.nextLine();

            if (input.length() < 5) {
                System.out.println("Invalid input. The string must contain at least five characters.");
            }
        } while (input.length() < 5);

        // Calculate the sum of ASCII values of the first five characters
        int sum = 0;
        int count = 0;
        do {
            sum +=input.charAt(count);
            //sum = sum + input.charAt(count);
            count++;
        } while (count < 5);

        System.out.println("The sum of ASCII values of the first five characters is: " + sum);

        scanner.close();
    }
}
