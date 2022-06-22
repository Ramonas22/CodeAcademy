package codeAcademy.zilvinas.telefonas;

import java.util.Scanner;

class Paskaita2 {

    private  static void UzduotisPirma() {
        /*Turime tekstą \"Labas vakaras, Lietuva. Gera tave tureti\"\n" +
        "     Panaudodami substring(n,i) metodą atspausdinkite vienoje eilutėje Žodį \"Gera\",\n" +
        "     Kitoje eilutėje \"Lietuva. Gera\"*/


        String tekstas = "Labas vakaras, Lietuva. Gera tave tureti";
        System.out.println(tekstas.substring(24, 29));
        System.out.println(tekstas.substring(15, 23) + tekstas.substring(24, 29));
    }

    private  static void UzduotisAntra(){
        String tekstas1 = "abcdf";
        String tekstas2 = "abcde";
        int skaicius = 1;
        String skaiciausTekstas = String.valueOf(skaicius); // String skaiciausTekstas = "" + skaicius

        System.out.println(tekstas1.compareTo(tekstas2));
        System.out.println(("Skaiciaus pavertimas i tekstas: ").concat(String.valueOf(skaicius)));

        System.out.println(skaiciausTekstas);
    }
    private class testas{
                /*
        System.out.println("Arijus".compareTo("arijus")); //-32 //nes lygina a su A
        System.out.println("Laba diena".lastIndexOf("a")); //9 //parodo ideksa kur pirma raide skaitant nuo galo
        System.out.println("Laba".compareTo("Labas")); // -1 //lygina Labas su laba, kadangi baze sutampa su lyginamu tekstu, bet turi papildoma simboli isvedama -1
        System.out.println(3 * (2 + 2) + ""+ 2 * 2 + 2); //1242 //kadangi 3* (2+2) = 12 "" pavercia likusi eilute i teksta
        System.out.println("sysout".compareTo("check")); //16 //lygina c su s ir tarp ju yra 16 simboliu skirtumas
        System.out.println("Laba diena".indexOf(2)); //-1 //nerastas simbolis
        System.out.println("Diena"+ "Laba diena".indexOf("diena")); //Diena5 //pradzioje spausdinamas zodis Diena tada be tarpo indeksas kur kur prasideda diena 5
        System.out.println("as".concat(" ir")); //as ir  //sujungia
        System.out.println("Laba diena".indexOf("a")); // 1 //rodo vieta kur yra a
        System.out.println("   Laba diena                          ".trim()); //Laba diena //nutrina tarpus
        System.out.println("labas".replace('a', 'u')); //lubus //pakeicia visas a -> u
        System.out.println("labas rytas".substring(3)); //as rytas //spausdina nuo 4 simbolio imtinai
        System.out.println("labasrytas".substring(3, 5)); //as //spausdina nuo 4 simbolio imtinai iki 5 imtinai
        System.out.println("labas".equals("Labas")); // false //Nes antra salyga is didziosios raides
        System.out.println("bit".compareTo("big")); //13 // tarp g ir t yra 13 simboliu tarpas
        String labas;
        //kam lygi labas reiksme?  tuscia eilute
        System.out.println("labas".length()); //5 //spausdina duoto teksto ilgi
        */

    }

    //Uzduotis:

    private static void Vienas(String tekstas2){
        /*
         Parašyti statinį metodą, kuris išspausdiną perduotą tekstinę reikšmę.​

            Pvz .: panaudojimas main metode:

            1. jusu metodo pavadinimas>(“Vienas”);

            2.  String tekstas = “Du”;

            3. jusu metodo pavadinias>(tekstas);
        * */
        String tekstas = "Du";

        System.out.println(tekstas);
        System.out.println(tekstas2);
    }

    private  static void Antras(String[] args){
        System.out.println(args);
    }

    private  static void Trecias(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i<5;i++) {
        sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    private class Telefonas{
        String marke = "Nokia";
        String modelis = "3310";
        int atmintis = 125;
        String spalva = "Juoda";
        }
    private  static void parodyk(){
        Telefonas telefonas = null;
        System.out.println(telefonas.marke +" "+ telefonas.modelis +" "+ telefonas.atmintis +" "+ telefonas.spalva);
    }
}
