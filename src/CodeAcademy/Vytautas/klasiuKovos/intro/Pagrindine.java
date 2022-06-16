package CodeAcademy.Vytautas.klasiuKovos.intro;


import lombok.Cleanup;

import java.util.Scanner;


class Pagrindine {

    public static void main(String[] args){

        @Cleanup Scanner skanuok = new Scanner(System.in);

        //Figura figuraSuParametrais = new Figura("Keturkampis" , 4, 16, 16);

        //System.out.println("Iveskite figuros pavadinima");
        //Figura figura2 = new Figura(skanuok.nextLine());

       // System.out.println(figura2.getPavadinimas());

        //System.out.println(figuraSuParametrais.getPavadinimas() + " " + figuraSuParametrais.getKampuSkaicius()
        //       + " " + figuraSuParametrais.getPerimetras() + " " + figuraSuParametrais.getPlotas());

        VardenisPavardenis petras = new VardenisPavardenis();
        petras.spausdinkVardaSuPavarde();

        System.out.println(petras.getVardas() + " " + petras.getPavarde() + " " + petras.getAmzius());

        petras.spausdinkVardaSuPavarde();

    }
}