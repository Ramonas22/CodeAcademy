package codeAcademy.vytautas.test;


public class TestText {

    public static void main(String[] args) {
        /*                //+31              -32
        System.out.println("a".compareTo("b"));
                        //+31 +30            -31 -0
        System.out.println("as".compareTo("a"));
                        //
        System.out.println("la".compareTo("lab"));

        System.out.println("sysout".compareTo("check"));
        */

        double x = 400;
        System.out.println(test(x) + " from " + x);
        double c = test(x);
        System.out.println(c * c / test(c) + " from " + test(x));

    }


    static double test(double x) {
        return x * 0.247/114/0.25;
    }
}
