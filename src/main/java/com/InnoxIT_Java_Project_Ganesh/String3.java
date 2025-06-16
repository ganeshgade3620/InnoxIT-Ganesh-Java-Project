import java.util.Scanner;
    public class String3 {
//write a java program to count how many words start with vowel
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in) ;
            System.out.println("Enter the string");
            String sentence =sc.nextLine().toLowerCase();

            String []arr=sentence.split(" ");

            int count=0;
            for (int i=0;i<arr.length-1;i++)
            {
                String temp=arr[i];
                char ch=temp.charAt(0);
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    System.out.println(arr[i]);
                    count++;

                }
            }
            System.out.println(count);
        }
    }
