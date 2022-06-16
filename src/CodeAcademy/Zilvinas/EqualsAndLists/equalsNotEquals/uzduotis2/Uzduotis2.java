package CodeAcademy.Zilvinas.EqualsAndLists.equalsNotEquals.uzduotis2;

class Uzduotis2 {
    public static void main(String[] args) {
        Tankas tankas = new Tankas();
        Tankas asmuo = new Tankas();

        palygink(tankas, asmuo);


        System.out.println("\nNuoroda i ta pati objekta");

        tankas = asmuo;

        palygink(tankas, tankas);
    }

    static void palygink(Tankas tankas,Tankas asmuo){
        if (tankas.equals(asmuo)){
            System.out.println("\nLyginant su equals() jie lygus");
        }else {
            System.out.println("\nLyginant su equals() jie nelygus");
        }
        if (tankas == asmuo){
            System.out.println("\nLyginant == jie lygus");
        }else {
            System.out.println("\nLyginant == jie nelygus");
        }

    }
}
