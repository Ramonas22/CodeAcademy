package CodeAcademy.Zilvinas.EqualsAndLists.sarasai.examples;

import java.util.ArrayList;

class Example1 {
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

        /* Idedama dar elementu i saraso pradzia */

        sarasas.add(0, "Sestas");
        sarasas.add(1, "Septintas");

        /* Isimami/istrinami elementai is saraso pagal reiksme */
        sarasas.remove("Trecias");
        sarasas.remove("Penktas");

        System.out.println("Saraso elementai: " + sarasas);

        /* Isimamas/istrinamas 1-as elementas */
        sarasas.remove(1);

        System.out.println("Saraso elementai: " + sarasas);
    }
}
