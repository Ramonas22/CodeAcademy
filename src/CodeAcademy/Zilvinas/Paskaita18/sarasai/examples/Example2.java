package CodeAcademy.Zilvinas.Paskaita18.sarasai.examples;

import java.util.ArrayList;

class Example2 {
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

        // pakeiciamas 2-as elementas
        sarasas.set(2, "*****");
        System.out.println("Saraso elementai: " + sarasas);

        // gaunama elemento pozicija sarase
        int pos = sarasas.indexOf("*****");
        System.out.println(pos);

        // gaunamas elementas pagal indeksa
        String elementas = sarasas.get(2);
        System.out.println(elementas);

        // gaunamas saraso dydis

        int sarasoDydis = sarasas.size();
        System.out.println(sarasoDydis);

        boolean arYraAntras = sarasas.contains("Antras");
        System.out.println(arYraAntras);
        // isvalo sarasa
        sarasas.clear();
        System.out.println(sarasas);
        System.out.println(sarasas.size());

        // patikrina ar sarasas tuscias
        boolean arTuscias = sarasas.isEmpty();
        System.out.println(arTuscias);
    }
}
