public class ArithOperator2{
    public static void main(String[] args) {
        //Operator Precedence
        System.out.println( 5 + 9 - 3 + 2 * 5 );
        System.out.println(5 + 9 - 3 + (2*5));
        System.out.println( ((5 + 9) -3) + (2 * 5));
        System.out.println(  ((5 + 9)-(3 + 2)* 5));
    }
}
