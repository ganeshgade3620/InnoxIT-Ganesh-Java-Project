public class Que8Assinment {
    public static void main(String[] args) {
        // Below is a nested for loop with a labeled break statement. What would the value of variable num be once the below code executes.
        // Try to answer without executing this code in the editor.

        int num = 0;//1,2,3,4,5,6,7,8,9,10
        outer:
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    break outer;
                }
                num++;
            }
        }
        System.out.println(num);
    }
}
