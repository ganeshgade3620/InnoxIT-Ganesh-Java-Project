package StringOperations;

public class StringConcatenation8 {
    public static void main(String[] args) {
        //joining two or more strings together.

        //using + operator
        String s1 = "Ganesh";
        String s2 = "Gade";
        String res = s1 + " " + s2;
        System.out.println(res); // Ganesh Gade

        System.out.println();
        //using concat()
        String s3 = "Hello";
        String s4 = "Java";
        String res2 = s3.concat(" ").concat(s4);
        System.out.println(res2); //Hello Java

        System.out.println();

        //Using StringBuilder or StringBuffer
        StringBuilder sb = new StringBuilder();
        sb.append("Good").append(" ").append("Morning");
        System.out.println(sb.toString()); //Good Morning

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Good").append(" ").append("Morning");
        System.out.println(sb2.toString()); // Good Morning




    }
}
