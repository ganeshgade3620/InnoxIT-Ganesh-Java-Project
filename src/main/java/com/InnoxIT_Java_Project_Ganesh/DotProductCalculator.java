public class DotProductCalculator {

    //method to compute the dot product of two arrays
    public static int dotProduct(int[]a,int[]b){
        //variable to store the sum of products
        int sum=0;

        //Iterate through each element of the arrays
        for (int i=0;i<a.length;i++){
            //multiply corresponding elements and add to sum
            sum=sum + a[i]*b[i];
        }
        //return the final computed dot product
       return sum;
    }
    public static void main(String[] args) {
        //define  two 1D arrays of equal length
        int[] a={2,0,4};
        int[] b={1,4,3};

        //call the dotProduct method and store the result
        int result=dotProduct(a,b);
        System.out.println("Dot Product: "+result);
    }
}
