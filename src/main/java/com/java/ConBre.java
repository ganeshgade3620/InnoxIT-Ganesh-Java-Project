public class ConBre {

    //can we declared break and continue keyword inside the single program.
//ans:Yes,declared but break and continue keyword should be declared at the end of the
//block.
        public static void main(String[] args)
        {
            int n=0;
            while (n<5)
            {
                System.out.println(n);
                if (n==0)
                {
                    System.out.println("if block");
                    n++;
                    continue;
                }
                System.out.println(n);
                n++;
                break;
            }
        }
    }

