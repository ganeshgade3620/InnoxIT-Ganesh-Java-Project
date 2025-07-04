package StringOperations;

public class WordReverse {
    public static void reverseWord(String sentence) {
        String[]words=sentence.split(" ");
        String result="";
        System.out.println(words.length);//3
        for (int i=words.length-1;i>=0;i--){
            result=result + words[i];
            result=result+" ";
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
       reverseWord("Java is fun");
    }
}
