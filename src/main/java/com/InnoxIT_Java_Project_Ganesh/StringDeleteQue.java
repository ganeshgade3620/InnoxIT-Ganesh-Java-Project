import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;
public class StringDeleteQue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String sentence =sc.nextLine();
        int number=sc.nextInt();

        // Create a StringTokenizer with space as the default delimiter

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        // Count and print tokens

        System.out.println("Total tokens: " + tokenizer.countTokens());

        StringBuilder sb=new StringBuilder();

        System.out.println("Enter word to delete: ");
        String delete=sc.nextLine();
        while (tokenizer.hasMoreTokens()) {
            String token=tokenizer.nextToken();
             if (!delete.equalsIgnoreCase(token)) {
                 sb.append(token);
                 // System.out.println(tokenizer.nextToken());
                sb.append(" ");
             }

        }
        System.out.println("Sentence using sb: "+ sb.toString());

    }

} 