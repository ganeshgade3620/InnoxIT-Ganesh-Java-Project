package StringOperations;

public class Que10RemoveAll {
    public static void main(String[] args) {
        String  str="123Hello45 World324";
        str=str.replaceAll("\\d","");
        System.out.println(str);
    }
}
