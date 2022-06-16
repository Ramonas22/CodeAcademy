package CodeAcademy.Zilvinas.ifs;

import java.util.Scanner;

class Paskaita5 {

    public static void main(String[] args) {


    }

    private static void pilanametis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesktie savo amziu: ");
        int amzius = scanner.nextInt();
        if (!(amzius < 18 && amzius > 0)) {
            System.out.println("Jus esate pilnametis");
        } else {
            System.out.println("Jus neesate pilanmetis");
        }
    }

    private static void amziausCenzas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesktie savo amziu");
        int skaicius = scanner.nextInt();
        if (skaicius > 30 && skaicius < 39) {
            System.out.println("Jus esate ketvirtame desimtmetyje");
        } else {
            System.out.println("Jus neesate ketviratame desimtmetyje");
        }
    }

    private static void keliamieji() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesktie metus");
        int metai = scanner.nextInt();

        if (metai % 4 > 0) {
            System.out.println("Metai nekeliami");
        } else if (metai % 100 > 0) {
            System.out.println("Metai yra keliami");
        } else if (metai % 400 > 0) {
            System.out.println("Metai nera keliami");
        } else {
            System.out.println("Metai yra keliami");
        }
    }

    private static void spausdintiMenesi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite menesi");
        int menesis = scanner.nextInt();

        if (menesis <= 0) {
            System.out.println("Netinkamas skaicius");
        } else if (menesis >= 13) {
            System.out.println("Netinkamas skaicius");
        } else if (menesis % 2 == 0) {
            switch (menesis) {
                case 2 -> {
                    System.out.println("VASARIS");
                }
                case 4 -> {
                    System.out.println("BALANDIS");
                }
                case 6 -> {
                    System.out.println("BIRZELIS");
                }
                case 8 -> {
                    System.out.println("RUGPJUTIS");
                }
                case 10 -> {
                    System.out.println("SPALIS");
                }
                case 12 -> {
                    System.out.println("GROUDIS");
                }
            }
        } else {
            switch (menesis) {
                case 1 -> {
                    System.out.println("sausis");
                }
                case 3 -> {
                    System.out.println("kovas");
                }
                case 5 -> {
                    System.out.println("geguze");
                }
                case 7 -> {
                    System.out.println("liepa");
                }
                case 9 -> {
                    System.out.println("rugsejis");
                }
                case 11 -> {
                    System.out.println("lapkritis");
                }
            }
        }
    }


}
