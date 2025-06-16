public class Recursion3 {

            // Recursive method to calculate factorial
            public static int factorial(int n) {
                if (n == 0 || n == 1) { // Base case
                    return 1;
                }
                return n * factorial(n - 1); // Recursive call
            }
            public static void main(String[] args) {
                int num = 4; // Example number
                System.out.println("Factorial of " + num + " is: " + factorial(num));
            }
        }
