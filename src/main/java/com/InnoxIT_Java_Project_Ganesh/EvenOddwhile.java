public class EvenOddwhile {
    public static void main(String[] args) {
        int num=31;

        //check if the number is greater than 25
        if (num>25){
            //determine if the number is even or odd
            if (num % 2==0) {
                System.out.println(num + " is greater than 25 and is an even number.");
            }
            else {
                System.out.println(num+" is greater than 25 and is an odd number.");
            }
        }
        else {
            System.out.println(num+" is not greater than 25.");
        }
    }
}
