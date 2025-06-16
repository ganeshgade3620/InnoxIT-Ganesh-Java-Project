public class String6 {
    public static void main(String[] args) {
        String text="To Lower Case";
        text=text.replace(" ","_");
        System.out.println(text);

        String letter="Dear <|name|>,Thanks a lot!";
        letter=letter.replace("<|name|>","GANESH");
        System.out.println(letter);

        System.out.println();

        String sentence="Hi my   name is Ganesh..";
        System.out.println(sentence.indexOf("   "));
        System.out.println(sentence.indexOf("    "));

        System.out.println();

        String myLetter="Dear Harry, \nThis Java Course is Nice,\nThanks!";
        System.out.println(myLetter);
        System.out.println();
        String myLetter2="Dear Harry, \n\tThis Java Course is Nice,\n\tThanks!";
        System.out.println(myLetter2);

    }
}
