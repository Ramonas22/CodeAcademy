package CodeAcademy.Zilvinas.Paskaita8.Uzduotys5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String[] menesiai = {"Sausis", "Vasaris", "Kovas", "Balandis", "Geguze", "Birzelis", "Liepa", "Rugpjutis",
                "Rugsejis", "Spalis", "Lapkritis", "Gruodis"};
        Scanner scanner = new Scanner(System.in);
        int laikinas;

        System.out.println(menesiai.length);

        System.out.println(menesiai[0]);

        //masyvo paskutinį elementą (ne 11, bet dinamiškai kintantį).
        System.out.println(menesiai[menesiai.length-1]); //?????


        System.out.println("Ivesk skaiciu nuo 1 iki 12");
        laikinas = scanner.nextInt() - 1;
        if (laikinas >= 0 && laikinas < 12) {
            System.out.println(menesiai[laikinas]);
        } else {
            System.out.println("Neteisingas skaicius");
        }

        if (laikinas >= 0 && laikinas < 12)
            if (laikinas == 0) {
                System.out.println(menesiai[menesiai.length - 1] + " " + menesiai[laikinas + 1]);
            } else if (laikinas == menesiai.length - 1) {
                System.out.println(menesiai[laikinas - 1] + " " + menesiai[0]);
            } else {
                System.out.println(menesiai[laikinas - 1] + " " + menesiai[laikinas + 1]);
            }
    }

}

