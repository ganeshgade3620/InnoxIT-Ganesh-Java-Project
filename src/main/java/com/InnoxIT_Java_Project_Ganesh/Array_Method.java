public class Array_Method {


    static void modifyArray(int[] arr){
        arr[0]=100;
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        modifyArray(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }
}
