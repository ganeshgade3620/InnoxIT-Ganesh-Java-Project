public class Recursion{
    //write a program to print first five number uusing recursive method

    public static void test(int n){
        System.out.println(n);
        if (n==5){
            return;
        }
        n++;
        test(n);
    }
    public static void main(String[] args) {
        System.out.println("start");
        test(0);
        System.out.println("stop");
    }
}
