package codeAcademy.vytautas.nebezinau;

import java.util.Scanner;

class PirmaDalis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesktie staciakampio ilgi: ");
        int ilgis = scanner.nextInt();
        System.out.println("Ivesktie staciakampio auksti: ");
        int aukstis = scanner.nextInt();
        System.out.println("Jusu perimetras " + staciakampioPerimetrasParametrai(ilgis,aukstis));


        System.out.println("Iveskite pirma teksta");
        String tekstas1 = scanner.next();
        System.out.println("Iveskite antra teksta");
        String tekstas2 = scanner.next();
        System.out.println(SujungtiTeksta(tekstas1,tekstas2));
    }

    public static void SpausdintiInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savo varda: ");
        String vardas = scanner.next();
        System.out.println("Mano vardas" + vardas);

        System.out.println("Iveskite ugi");
        int ugis = scanner.nextInt();
        System.out.println("Jusu ugis: " + ugis);
    }
    public static void Staciakampis(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite staciakampio ilgi: ");
        double ilgis = scanner.nextDouble() ;
        System.out.println("Iveskite staciakampio auksti: ");
        double aukstis = scanner.nextDouble();
        double perimetras = (ilgis + aukstis) * 2;
        double plotas = ilgis*aukstis;
        System.out.println("Jusu staciakapio perimetras: " + perimetras +"\nJusu staciakampio plotas: " + plotas);
    }
    public static int StaciakampioPerimetras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite staciakampio auksti ");
        int auktis = scanner.nextInt();
        System.out.println("Iveskite staciakampio ilgi ");
        int ilgis = scanner.nextInt();
        return (auktis+ilgis) * 2;
    }
    public static int staciakampioPerimetrasParametrai(int ilgis, int aukstis){
        return 2*(ilgis+aukstis);
    }
    public static String SujungtiTeksta(String tekstas1, String tekstas2){
        return tekstas1.concat(tekstas2);
    }
}
