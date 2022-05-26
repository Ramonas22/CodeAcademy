package CodeAcademy.Zilvinas.Paskaita8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){
        Scanner idomi1 = new Scanner(System.in);

        System.out.println("Ivesk sakini");
        String tekstas = idomi1.nextLine();

        System.out.println(tekstas.toUpperCase());

        System.out.println(tekstas.length());

        System.out.println(tekstas.substring(tekstas.lastIndexOf(" ")).trim());

        System.out.println(tekstas.replace("a", "W"));

        System.out.println(tekstas.replace("e", "RAIDE"));


        //substring
        System.out.println(
                tekstas.substring(tekstas.lastIndexOf(" ")).trim()  +
                        tekstas.substring(tekstas.indexOf(" "), tekstas.lastIndexOf(" ")) +
                        " "+
                        tekstas.substring(0,tekstas.indexOf(" "))
        );

        //split
        String[] tekstas2 = tekstas.split(" ");

        System.out.print(tekstas2[tekstas2.length-1] + " ");
        for (int i = 1; i < tekstas2.length -1; i++) {
            System.out.print(tekstas2[i] + " ");
        }
        System.out.print(tekstas2[0]);
    }
}
