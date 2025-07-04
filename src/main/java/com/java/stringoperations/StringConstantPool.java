package StringOperations;

public class StringConstantPool {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        //Because strings are immutable, Java can safely reuse the same object
    	//Only one object ("Hello") is created in the pool.
	    //Both str1 and str2 point to the same object in memory.

    }
}
