public class Student {
    //reference variable declarations
   static int computeCount;
    int id;
    String name;
    String gender;
    byte age;
    long  phone;
    double cgpa;
    char degree;

    boolean international;
    double tuitionFees=10000.100;
    double internationalFees=5000.00;

    void compute(){
        int nextId=id+1;
        computeCount++;
        if (international){
            tuitionFees=tuitionFees + internationalFees;
            System.out.println(tuitionFees);
        }
        System.out.println("id: "+id);
        System.out.println("nextId: "+nextId);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("cgpa: "+cgpa);
        System.out.println("degree: "+degree);
        System.out.println("computeCount: "+computeCount);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=1;
        s1.name="ganesh";
        s1.gender="male";
        s1.age=19;
        s1.phone=705_709_371_9l;
        s1.cgpa=7.12;
        s1.degree='B';
        s1.international=true;
        s1.compute();

        Student s2=new Student();
        s2.name="vaibhav";
        s2.gender="male";
        s2.id=2;
        s2.age=20;
        s2.phone=725_709_371_9l;
        s2.cgpa=8.12;
        s2.degree='M';
        s2.international=false;
        s2.compute();
        s1.compute();

    }
}
