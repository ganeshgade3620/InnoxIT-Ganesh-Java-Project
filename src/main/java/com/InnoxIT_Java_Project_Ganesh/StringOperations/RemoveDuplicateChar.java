package StringOperations;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str="aabcccccaaa";
        char[]array=str.toCharArray ();
        String result = "";
        int count= 1;
        for(int i=1;i<array.length;i++){
            if(array[i]==array[i-1]){
                count++;
            }else{
                result=result+array[i-1]+count;
                count=1;
            }
        }
       result=result+array[array.length-1]+count;
        System.out.println (result);
    }
}
