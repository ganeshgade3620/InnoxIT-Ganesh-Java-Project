public class TwoDArray {

    static void initializeArray(int[][] arr) {
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[1][0] = 4;
        arr[1][1] = 8;
        arr[2][0] = 6;
        arr[2][1] = 4;
        arr[3][0] = 9;
        arr[3][1] = 5;
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        initializeArray(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);

    }
}
