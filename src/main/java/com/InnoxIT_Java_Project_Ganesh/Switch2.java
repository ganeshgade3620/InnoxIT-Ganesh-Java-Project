public class Switch2 {
    public static void main(String[] args) {
        int a = 6;
        switch (a%2) {//switch value
            case 0:{
                System.out.println("even");
                break;
            }
            case 1:{
                System.out.println("odd");
            }
        }
    }
}
