public class FactorialDoWhile {
    public static void main(String[] args) {
        int num=5;
        long factorial=1;
        int i=1;
        do {
            factorial *=i;//multiply factorial by current value of i.
            i++;
        }
        while (i<=num);//continue until i>num
        System.out.println("factorial of "+num+" is: "+factorial);
    }
}
