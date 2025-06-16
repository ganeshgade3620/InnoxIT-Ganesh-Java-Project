class CondOperator
{
    public static void main(String[] args)
    {
        int a=4;
        String res=a%2==0?"even":"odd";
        System.out.println(res);


        int x=110, y=79, z=30;
        int max;
        max = (x>y&&x>z)?x:(y>x&&y>z)?y:z;
        System.out.println(max);
    }
}
