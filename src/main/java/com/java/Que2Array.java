public class Que2Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6,5,4,7,8};
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}