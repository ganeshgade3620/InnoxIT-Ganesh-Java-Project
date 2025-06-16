public class StringRev {
    //WAP to reverse a given string
    public static void main(String[] args) {
        String s="ganesh";
        String rev="";//h,s,e,n,a,g
                  //5,,4,3,2,1,0
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);//5,4,3,2,1,0

        }
        System.out.println(rev);

    }
}
