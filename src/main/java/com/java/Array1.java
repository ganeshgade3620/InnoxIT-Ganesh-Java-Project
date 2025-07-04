public class Array1 {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int i=1,j=1;
        for (i=0,j=0;i<arr.length && j<arr.length;i++,j++){
            System.out.println(arr[i]+" "+arr[j]);
        }
    }
}
