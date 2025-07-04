class Operator
{
    public static void main(String[] args)
    {
        //arithmetic operator
        double a=10;
        double b=20;
        double res=a%b;
        System.out.println(res);

        //comparison operator
        int	n1=10;
        int n2=20;
        if (n1==10  || n2==21)
        {
            System.out.println("match no");
        }

        //increment operator
        //post increment operator
        System.out.println(n1++);
        System.out.println(n1);
        //pre increment operator
        System.out.println(++n1);
        System.out.println(n1);

        //decrement opretor
        //post decrement operator
        System.out.println(n2--);
        System.out.println(n2);
        //pre decrement operator
        System.out.println(--n2);
        System.out.println(n2);

        int age=23;
        int age2=48;
        System.out.println("hello");
        System.out.println((int)(Math.random()*1100));
    }
}
