public class Methods {
    static double sum(double x, double y){
        return x + y;
    }
    static double avg(double x, double y){
        double sum=sum(x,y);
        return sum/2;
    }
    static boolean search(int[] list, int key){
        return true;
    }
    public static void main(String[] args) {
       // float d=(float) sum(12.99f,(float) 5.5);
    //    System.out.println(d);
        double d2=avg(5.5,4.5);
        System.out.println(d2);
        System.out.println();
        int[] list={1,2};
        search(new int[]{1,2},2);
        System.out.println(list[0]);
        System.out.println(list[1]);
    }
}
