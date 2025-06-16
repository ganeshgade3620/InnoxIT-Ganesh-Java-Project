package StringOperations;

public class StringBuilder_StringBuffer7 {
    public static void main(String[] args) {
        //StringBuilder and StringBuffer are used to create mutable strings
        // meaning their contents can be modified without creating a new object
        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  //Adds text at the end
        System.out.println(sb); // Hello World

        // StringBuffer example
        StringBuffer sbf = new StringBuffer("Java");
        sbf.insert(4, " Rules");//Inserts text at a specific index
        System.out.println(sbf); // Java Rules
    }
}
