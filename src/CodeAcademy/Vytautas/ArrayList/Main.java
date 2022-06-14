package CodeAcademy.Vytautas.ArrayList;


public class Main {

    public static void main(String[] args) {
        /*Integer a1 = new Integer(1);
        Integer a2 = new Integer(1);


        Boolean check = a1.equals(a2);
       // System.out.println(check);

        String a = "a";
        String b = "a";

        System.out.println(a == b);

        a = new String("a");
        b = new String("a");
        System.out.println(a == b);*/

        String word1 = new String( "Word");
        String word2 = new String( "Word");

        System.out.println("------");
        compare(word1,word2);

        word1 = word2;

        System.out.println("------");
        compare(word1,word2);

        String word3 = "Word";
        String word4 = "Word";

        System.out.println("------");
        compare(word3,word4);

        String word5 = "Word";
        String word6 = new String("Word6");

        System.out.println("------");
        compare(word5,word6);
        word5 = word6;

        System.out.println("------");
        compare(word5,word6);
    }

    static void compare(String variable1, String variable2){
        System.out.println("Variables have same values " + variable1.equals(variable2));
        System.out.println("Variables refer to same object " + (variable1 == variable2));
    }
}
