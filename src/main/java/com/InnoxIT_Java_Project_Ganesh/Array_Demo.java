public class Array_Demo {

   static int[] scores;
    static void arrays(int []scores){

        //first way
     ///  int[] scores =new int[4];
     /*   scores=new int[4];
        scores[0]=90;
        scores[1]=50;
        scores[2]=70;
        scores[3]=100;*/
        //2nd way
        /*int[] scores=new int[] {10,20,30,50};*/

        //3rd way

        System.out.println("\nInside arrays..." );
        System.out.println("mid-term: 1 "+scores[0]);
        System.out.println("mid-term: 2 "+scores[1]);
        System.out.println("final: "+scores[2]);
        System.out.println("project: "+scores[3]);
       // System.out.println(scores[4]);

       // boolean[]a=null;
        //System.out.println(a[0]);

    }

    public static void main(String[] args) {
        int[] scores={40,10,60,100};
        arrays(scores);
        System.out.println(scores.length);
       System.out.println(Array_Demo.scores);

       Student[]students=new Student[3];

     /*  students[0]=new Student();
       students[1]=newy Student();
       students[2]=new Student();  */

        Student1[]students1={new Student1(),new Student1(),new Student1()};
        students1[0].name="john";
        students1[1].name="Raj";
        students1[2].name="Anita";
        System.out.println("student1: "+students1[0].name);
        System.out.println("student2: "+students1[1].name);
        System.out.println("student3: "+students1[2].name);

        char[] grades={'a','b','c','d'};
        System.out.println(grades);

        double[] location={34.5554,23.3423};
        System.out.println(location[0]);
        System.out.println(location);



    }
}
