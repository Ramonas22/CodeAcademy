package CodeAcademy.Zilvinas.EqualsAndLists.sarasai.examples;

import java.util.ArrayList;

class Example3 {
    public static void main(String[] args) {

        /* Sukuriamas dinaminio saraso objektas */
        ArrayList<String> sarasas = new ArrayList<>();


        /* Dedami objektai i sarasa */
        sarasas.add("Pirmas");
        sarasas.add("Antras");
        sarasas.add("Trecias");
        sarasas.add("Ketvirtas");
        sarasas.add("Penktas");
        System.out.println("Saraso elementai: " + sarasas);


        for (String elementas : sarasas) {

            int i = sarasas.indexOf(elementas);

            System.out.println("Elementas: " + elementas + ", Indeksas: " + i);

        }

        System.out.println("Saraso elementai: " + sarasas);

    }
}
