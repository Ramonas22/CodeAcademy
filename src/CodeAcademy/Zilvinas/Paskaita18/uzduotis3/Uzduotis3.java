package CodeAcademy.Zilvinas.Paskaita18.uzduotis3;

class Uzduotis3 {

    public static void main(String[] args) {
        Uzduotis3 o1 = new Uzduotis3();
        Uzduotis3 o2 = new Uzduotis3();

        Uzduotis3 laikinas = new Uzduotis3();

        laikinas = o1;
        o1 = o2;
        o2 = laikinas;
    }
}
