package StringOperations;

public class StringFormatting9 {
    public static void main(String[] args) {
        //when I want clean, readable, and flexible string construction to avoid + operator
        String name = "Ganesh";
        int age = 22;

        String result = String.format("My name is %s ,and I am %d years old.", name, age);
        System.out.println(result);//My name is Ganesh ,and I am 22 years old.

        System.out.println();
        //currency formating
        double price = 99.99;
        System.out.println(String.format("Price: $%.2f", price));//Price: $99.99

        System.out.println();
        //date/time formating
        int day = 9, month = 4, year = 2025;
        String date = String.format("Today is: %02d/%02d/%04d", day, month, year);
        System.out.println(date);//Today is: 09/04/2025



    }
}
