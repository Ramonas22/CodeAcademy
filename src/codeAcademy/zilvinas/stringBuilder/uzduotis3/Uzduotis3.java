package codeAcademy.zilvinas.stringBuilder.uzduotis3;

import java.util.Scanner;

class Uzduotis3 {

    public static void main(String[] args) {
    spausdink();
    }
    private static void spausdink(){
        Scanner uzduotis3 = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String vardas = uzduotis3.nextLine();
        System.out.println("Iveskite pavarde");
        String pavarde = uzduotis3.nextLine();
        System.out.println("Iveskite gimimo metus");
        int metai = uzduotis3.nextInt();
        System.out.println("Iveskite ugi");
        double ugis = uzduotis3.nextDouble();

        String formateris = String.format("Asmens %s %s, gimusio %dm., ugis yra %.2fm.%n", vardas, pavarde, metai , ugis);

        System.out.printf("Asmens %s %s, gimusio %dm., ugis yra %.2fm.%n", vardas, pavarde, metai , ugis);

        System.out.println(formateris);
    }
}
