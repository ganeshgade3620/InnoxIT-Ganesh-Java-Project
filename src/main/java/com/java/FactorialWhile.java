public class FactorialWhile {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        int i = 1;
        while (i <= 5) {
            factorial *= i;
            i++;
        }
        System.out.println("factorial of " + num + " is: " + factorial);
    }
}
