package codeAcademy.vytautas.septintaPaskaita;

import java.util.*;

class Masyvai {

    public static void main(String[] args) {

       /* Scanner skenerisMaksiminisCj = new Scanner(System.in);

        System.out.println("Ivesk indeksa zodzio");
        spausdinkSupildytaMasyva(skenerisMaksiminisCj.nextInt());*/


    }

    protected static void vardai() {
        Scanner scanner = new Scanner(System.in);

        String[] vardai = new String[10];

        for (int i = 0; i < vardai.length; i++) {
            System.out.println("Iveskite " + (i + 1) + " varda");
            vardai[i] = scanner.next().toUpperCase();
        }

        for (int i = 0; i < vardai.length; i++) {
            System.out.println(vardai[i] + "-" + vardai[i].length() + "-" + i);
        }

    }

    protected static void figura() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected static void spausdinkSupildytaMasyva(int skaicius) {
        String[] masyvas = {"Labas", "Krabas", "Olegas", "Ratata"};
        if (skaicius <= masyvas.length && skaicius >= 0) {
            System.out.println(masyvas[skaicius]);
        }
    }

    protected static void skaiciai() {
        Scanner scanner = new Scanner(System.in);

        int laikinas;
        int max = 0;
        int min = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");
            laikinas = scanner.nextInt();

            if (max < laikinas)
                max = laikinas;
            if (min > laikinas)
                min = laikinas;
        }
    }

    protected static void iveskSkaiciu() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int laikinas = 0;
        List<Integer> sarasasInt = new ArrayList<>();

        do {
            System.out.println("Ivesk " + (i + 1) + " skaiciu");
            laikinas = scanner.nextInt();
            sarasasInt.add(i, laikinas);
            i++;
        } while (laikinas >= 0);

        for (int j = 0; j < sarasasInt.size(); j++) {
            System.out.println("Iveskas " + (j + 1) + " skaicius " + sarasasInt.get(j));
        }

    }

    protected static void vidurkis() {
        Scanner iki = new Scanner(System.in);


        System.out.println("Iveskite keliu skaiciu vidruki noresite suskaiciuoti");
        int[] masyvas = new int[iki.nextInt()];

        //Nusakitimui
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");
            masyvas[i] = iki.nextInt();
        }

        //vidurkis
        double vidrukis = 0;
        for (int i : masyvas) {
            vidrukis += i;
        }
        System.out.println("Jusu skaiciu vidurkis: " + vidrukis / masyvas.length);
    }

    protected static void lyginiai() {
        Scanner maksima = new Scanner(System.in);

        List<Integer> sarasas = new ArrayList<>();
        int laikinas;

        while (true) {
            System.out.println("Iveskite skaiciu, jei norite baigti programa iveskite neigiama skaiciu arba 0");
            laikinas = maksima.nextInt();
            if (laikinas > 0) {
                if (laikinas % 2 == 0) {
                    sarasas.add(laikinas);
                }
            } else {
                break;
            }
        }
        for (Integer sarasa : sarasas) {
            System.out.println(sarasa);
        }
    }

    protected static void fibonaciSpausdinti() {
        Scanner fibonaci = new Scanner(System.in);

        System.out.println("Kelinta fibonaci skaiciu nori gauti");
        int indeksas = fibonaci.nextInt();

        //su for
        /*for (int i = 0, sk1 = 1, sk2 = 1, laikinas; i < indeksas; i++){
            laikinas = sk2;
            sk2 += sk1;
            sk1 = laikinas;
            System.out.print(sk1 + " ");
        }*/


        //su while
        int sk1 = 1, sk2 = 1, laikinas, iteratorius = 0;
        while (true) {
            if (indeksas > iteratorius) {
                laikinas = sk2;
                sk2 += sk1;
                sk1 = laikinas;
                iteratorius++;
                System.out.print(sk1 + " ");
            } else {
                break;
            }
        }
    }

    protected static void vidurkisLyginiu() {
        Scanner pypPyp = new Scanner(System.in);

        System.out.println("Iveskite kiek skaiciu noresite ivesti");
        int[] masyvas = new int[pypPyp.nextInt()];
        int indeksas = 0, indeksas2 = 0, laikinas;
        double suma = 0;


        while (masyvas.length > indeksas) {
            System.out.println("Iveskite " + (indeksas + 1) + " skaiciu");
            laikinas = pypPyp.nextInt();
            if (laikinas % 2 == 0) {
                masyvas[indeksas2] = laikinas;
                indeksas2++;
            }
            indeksas++;
        }
        for (int i : masyvas
             ) {
            suma += i;
        }

        System.out.println("Lyginiu skaiciu suma: " + suma
                +"Ivestu skaicu, lyginiu skaiciu suma: " + suma / indeksas2);
    }

    protected static void skirtumas(){
        Scanner krabas = new Scanner(System.in);

        System.out.println("Kiek masyve bus skaiciu: ");
        int[] masyvas = new int[krabas.nextInt()];


        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Ivesk " + (i+1) + " skaiciu");
            masyvas[i] = krabas.nextInt();;
        }
        int max = masyvas[0], min = masyvas[0];

        for (int i: masyvas
             ) {
            if(i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("skirtumas tarp maziau ir didziausio skaicio yra: " + (max - min));
    }

}
