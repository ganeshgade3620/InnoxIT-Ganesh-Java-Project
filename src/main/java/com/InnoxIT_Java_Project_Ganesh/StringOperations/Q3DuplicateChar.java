package StringOperations;

public class Q3DuplicateChar{
    public static void removeDuplicateChars(String name) {
        char[] chars = name.toCharArray();
        int tail =0;//1

        for (int i = 0; i < chars.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (chars[i] == chars[j]) {
                    break;
                }
            }

            if (j == tail) {
                chars[tail] = chars[i];
                tail++;
            }
        }

        for (int i = 0; i < tail; i++) {
            System.out.print(chars[i]);
        }
    }

    public static void main(String[] args) {
        removeDuplicateChars("Ganesh Gade");
    }
}
