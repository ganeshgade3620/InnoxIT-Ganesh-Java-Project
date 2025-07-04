public class Que9Assinment {
    public static void main(String[] args) {
       // Below is a nested for loop with a continue statement. What would the value of variable num be once the below code executes.
        // Try to answer without executing this code in the editor.

        int num = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    continue;
                }
                num++;
            }

        }
    }
}
