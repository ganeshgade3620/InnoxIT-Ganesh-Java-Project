public class Que4Array {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
           for (int i=0;i<number.length;i++){
              sum=sum+number[i];
              //sum +=number[i];
               }
             System.out.println("Sum of array elements are: "+sum);
           }
    }
