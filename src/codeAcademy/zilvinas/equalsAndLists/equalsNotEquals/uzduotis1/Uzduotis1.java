package codeAcademy.zilvinas.equalsAndLists.equalsNotEquals.uzduotis1;

class Uzduotis1 {

    public static void main(String[] args) {
        pirmaDalis();
        antraDalis();
        treciaDalis();

    }

    static void pirmaDalis() {
        System.out.println("\nNaudojam reiksmiu priskirima");
        String zodis = "Zodis";
        String zodis2 = "Zodis";

        if (zodis == zodis2) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
        if (zodis.equals(zodis2)) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
    }

    static void antraDalis() {
        System.out.println("\nNaudojam objektus");
        String zodis = new String("Zodis");
        String zodis2 = new String("Zodis");

        if (zodis == zodis2) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
        if (zodis.equals(zodis2)) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }

        zodis2 = zodis;
        System.out.println("\nPo priskirimo");
        if (zodis == zodis2) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
        if (zodis.equals(zodis2)) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
    }

    static void treciaDalis(){
        System.out.println("\nTrecia dalis");
        String zodis = new String("Alga");
        String zodis2 = new String("Zodis");

        if (zodis == zodis2) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
        if (zodis.equals(zodis2)) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }

        zodis2 = zodis;
        System.out.println("\nPo priskirimo");
        if (zodis == zodis2) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
        if (zodis.equals(zodis2)) {
            System.out.println("Reiksmes vienodos");
        } else {
            System.out.println("Reiksmes nelygios");
        }
    }
}
