public class VariableScope {

    int x = 5;
    int y = x + 1;
    //int z = w + 1;//Q1 legal or illegal?illegal as "w" is not yet defined

    void  foo(int a){
        int x=0;
        int k=x;//Q2 what value is k assigned?0 as x shadows gloable variable"x"
        System.out.println(x);
        System.out.println(k);

        if (k==0){
            int m=-1;//scope of m is within this if statement
        }
    //    k=m;//Q3 legal or illegal?illegal as scope of m ended with if statement
        bar();
    }
    void  bar(){
       // int b=k;Q4 legal or illegal?illegal as k's scope was only in foo
        int c=w;//Q5 legal or illegal?legal as w is global even though
               //it was defined below bar()method
    }
    int w=5;//another globle variable

    public static void main(String[] args) {
        VariableScope vs=new VariableScope();
        System.out.println(vs.x);
        System.out.println(vs.y);
       vs.foo(12);
    }
}
