package StringOperations;

public class StringMethods {
    public static void main(String[] args) {
                //String methods
                String name="ganesh gade";
                String upper=name.toUpperCase();
                System.out.println(upper);

                System.out.println(name.length());

                String lower=upper.toLowerCase();
                System.out.println(lower);
                System.out.println();
                System.out.println(name);//immutable nature

                String spacesString= "  gana   ";
                System.out.println(spacesString.trim());

                System.out.println(name.substring(1));
                System.out.println(name.substring(3,6));

                System.out.println(name.replace('g','G'));
                System.out.println(name.replace("ganesh","Vaibhav"));

                System.out.println(name.startsWith("gan"));
                System.out.println(name.endsWith("gade"));

                System.out.println(name.charAt(0));

                System.out.println(name.indexOf("ga",4));
                System.out.println(name.indexOf("g"));

                System.out.println(name.lastIndexOf("g"));
                System.out.println(name.lastIndexOf("a",9));

                String name2="vaibhav gade";
                System.out.println(name.equals(name2));

                System.out.println(name2.equals("vaibhav gade"));
                System.out.println(name2.equalsIgnoreCase("Vaibhav GADE"));

            }
        }
