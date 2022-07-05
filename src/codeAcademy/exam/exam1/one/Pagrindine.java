package codeAcademy.exam.exam1.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pagrindine {

    public static void main(String[] args) {
        //Sukuriami asmenys naudojant konstruktorius su parametrais
        Asmuo asmuo1 = new Asmuo("Tomas" , "Ponas" , 1997);
        Asmuo asmuo2 = new Asmuo("Rolandas" , "Balandis", 1978);

        //Sukuriamas asmuo naudojant empty konstruktoriu
        Asmuo asmuo3 = new Asmuo();
        asmuo3.setVardas("Maryte");
        asmuo3.setPavarde("Vilkyte");
        asmuo3.setGimimoMetai(1988);

        Asmuo.kiekSukurtuAsmenu();

        List<Asmuo> asmuoList = new ArrayList<>(Arrays.asList(asmuo1,asmuo2,asmuo3));

        for (Asmuo asmuoTemp: asmuoList
             ) {
            asmuoTemp.spausdintiInfo();
        }

        //Pakeista moters pavarde ir atspaudsdinta
        asmuo3.pakeistiPavarde("Agurkiene");
        asmuo3.spausdintiInfo();

        //Kiek sukurti papildomus asmenys
        Asmuo asmuo4 = new Asmuo();
        Asmuo asmuo5 = new Asmuo();

        Asmuo.kiekSukurtuAsmenu();

        //Inicialai
        System.out.println("\n");
        System.out.printf("%s %s\n", asmuo2.getVardas().substring(0,1),asmuo2.getPavarde().substring(0,1));
    }
}
