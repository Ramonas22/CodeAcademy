package CodeAcademy.Zilvinas.Uzduotys;

import java.util.Scanner;

        /*
         Parašyti statinį metodą, kuris išspausdiną perduotą tekstinę reikšmę.​

            Pvz .: panaudojimas main metode:

            1. jusu metodo pavadinimas>(“vienas”);

            2.  String tekstas = “Du”;

            3. jusu metodo pavadinias>(tekstas);
        * */

public class Vienas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta: ");
        String tekstas2 = scanner.next();

        vienas(tekstas2);
    }
    static void vienas(String tekstas2){

        String tekstas = "Du";

        System.out.println(tekstas);
        System.out.println(tekstas2);
    }
}
