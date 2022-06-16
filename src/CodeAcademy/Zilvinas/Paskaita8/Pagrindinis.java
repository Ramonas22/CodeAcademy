package CodeAcademy.Zilvinas.Paskaita8;

import java.util.Scanner;


class Pagrindinis {


    public static void main(String[] args) {
        // uzduotis3();


        Asmuo petras = new Asmuo();
        petras.setVardas("Petras");
        petras.setPavarde("Petraitis");
        petras.spausdinkVardaSuPavarde();
        petras.asmuoSako("Kaip sekas ?");
        petras.asmuoKlausia();
        Darbuotojas techinkas = new Darbuotojas();
        techinkas.gautiInfo();
        techinkas.privatausPaketoMetodas();
    }

    private static void m1() {
        System.out.println("Pirmas metodas");
        m2();
    }

    private static void m2() {
        System.out.println("Antras metodas");
        m3();
    }

    private static void m3() {
        System.out.println("Trecias metodas");
    }

    private static void spausdink(String vardas, String pavarde, String kalba, int savaiciuSkaicius) {
        System.out.println("As " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba + " kalba per " + savaiciuSkaicius + " savaites.");
    }

    private static void spausdink(String vardas, String pavarde, String kalba) {
        System.out.println("As " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba + " kalba.");
    }

    private static double n1() {
        return 123.5;
    }

    private static double n2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        return scanner.nextDouble();
    }

    private static void uzduotis3() {
        double d1 = n1(), d2 = n2();
        System.out.println("Suma: " + (d1 + d2));
    }

}

