public class Que7Assinment {
    //Below is a nested for loop with a break statement. What would the value of variable num be once the below code executes.
    // Try to answer without executing this code in the editor. Note that without the break statement,
    // num would be 100  as there would be a total of 100 iterations.
    public static void main(String[] args) {
        int num = 0;//1,2,,3,4,5,6,7,8,9,10,

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    break;
                }
                num++;
            }

        }
        System.out.println(num);
    }
}
