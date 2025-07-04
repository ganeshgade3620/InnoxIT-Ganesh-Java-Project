public class StringCreation1 {
    public static void main(String[] args) {
        char[] chars={'j','a','v','a'};
        String str=new String(chars);
        System.out.println(chars);
        System.out.println(str);

        //using StringBuilder or StringBuffer
        StringBuilder sb=new StringBuilder("Hello");
        String str2=sb.toString();
        System.out.println(str2);
        System.out.println();

        String s1="Java";
        String s2= new String("Java");
        char[] letters={'J','a','v','a'};
        String s3=new String(letters);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}