package codeAcademy.vytautas.klasiuKovusSugrizimas;

import java.util.Scanner;

class KomandosKlasem {

    public void rusiuokNuoDidziausioIkiMaziausio(Studentas[] studentai) {
        Studentas studentas = new Studentas();

        for (int i = 0; i < studentai.length - 1; i++) {
            for (int j = 1; j < studentai.length; j++) {
                if (studentai[j - 1].getVidrukis() < studentai[j].getVidrukis()) {
                    studentas = studentai[i];
                    studentai[i] = studentai[j];
                    studentai[j] = studentas;
                }
            }
        }
    }
    public void rusiuokNuoMaziausioIkiDidziausio(Studentas[] studentai) {
        Studentas studentas = new Studentas();

        for (int i = 0; i < studentai.length - 1; i++) {
            for (int j = 1; j < studentai.length; j++) {
                if (studentai[j].getVidrukis() < studentai[j - 1].getVidrukis()) {
                    studentas = studentai[i];
                    studentai[i] = studentai[j];
                    studentai[j] = studentas;
                }
            }
        }
    }

    public void spausdintiGrupe(Studentas[] studentai) {
        for (Studentas studentas : studentai) {
            studentas.spausdinti();
        }
    }

    public Studentas[] uzpildykKlase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiek klaseje bus mokiniu ?");
        Studentas[] klase = new Studentas[scanner.nextInt()];

        for(Studentas studentas: klase){
            studentas = new Studentas();
            studentas.suveskStudentoInfo();
        }
        return klase;
    }
}
