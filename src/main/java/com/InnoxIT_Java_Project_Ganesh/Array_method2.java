public class Array_method2 {

    public static int sum(int[]b){
      int res=0;
      for (int index=0;index<b.length;index++)
      {
          res=res+b[index];
      }
      return res;
    }
    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int res=sum(a);
        System.out.println(res);

        int[] b={1,2,3,4};
        int res1=sum(b);
        System.out.println(res1);

    }
}
