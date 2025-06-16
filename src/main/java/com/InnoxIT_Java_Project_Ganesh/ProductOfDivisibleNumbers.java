
public class ProductOfDivisibleNumbers {
    public static void main(String[] args) {


        int i = 1;
        long product = 1;
        boolean found = false;

        do {
            if (i % 3 == 0 && i % 7 == 0) { // or (i % 21 == 0)
                product *= i;
                found = true;
            }
            i++;
        } while (i <= 50);

        if (found) {
            System.out.println("Product of numbers divisible by both 3 and 7 in the range is: " + product);
        } else {
            System.out.println("No numbers divisible by both 3 and 7 found in the given range.");
        }

    }
}
