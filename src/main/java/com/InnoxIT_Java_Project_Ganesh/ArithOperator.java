public class ArithOperator {

     static void evenOdd(int num){

        System.out.println((num%=2));//0
         System.out.println(num);//0
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println((a+=5));//10
        System.out.println((a-=5));//5
        System.out.println((a*=5));//25
        System.out.println((a/=5));//5
        System.out.println((a%=5));//0
        System.out.println();

        //invalid
        System.out.println(a=+5);//5
        System.out.println(a=-5);
       // System.out.println(a=*5);
      //  System.out.println(a=/5);
     //   System.out.println(a=%5);

              evenOdd(50);
    }
}
