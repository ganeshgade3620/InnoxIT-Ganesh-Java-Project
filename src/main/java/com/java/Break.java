public class Break {
        public static void main (String[]args)
        {
            System.out.println("main begin");
            int n = 0;
            while (n < 5) {
                System.out.println(n);
                if (n == 2) {
                    System.out.println("if block");
                    n++;
                    break;
                    //break;//it will transfer the control to the end of the block
                }

                System.out.println(n);
                n++;
            }
            System.out.println("main end");
        }

    }
