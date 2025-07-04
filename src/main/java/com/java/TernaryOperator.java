public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(true?"a1":"a2");
        System.out.println(false?"a1":"a2");

        int a=12;
        int b=5;
        System.out.println(a>b?a:b);

        int n=23;
        int m=19;
        int res=n<m?n:m;
        System.out.println(res);
    }
}
