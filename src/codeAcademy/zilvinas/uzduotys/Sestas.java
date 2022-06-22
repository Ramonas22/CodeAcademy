package codeAcademy.zilvinas.uzduotys;

import java.util.Scanner;

class Sestas {
    /*
    * Klase skaiciuotuvas su metodaus: sudeti, atimti, dauginti, dalinti, dalybosLiekana.
    * Papildomai: padaryti ja itneraktyvia, t.y Kad galima ivewssti skaicius ir pasirinkti koki veiksma atlikti
    * */
    static class Skaicuotuvas {
        double skaicius1, skaicius2;

        Skaicuotuvas() {
            skaicius1 = 0;
            skaicius2 = 0;
        }
    }

    public static double sudetis(Skaicuotuvas skaicuotuvas) {
        return skaicuotuvas.skaicius1 + skaicuotuvas.skaicius2;
    }

    public static double atimtis(Skaicuotuvas skaicuotuvas) {
        return skaicuotuvas.skaicius1 - skaicuotuvas.skaicius2;
    }

    public static double daugyba(Skaicuotuvas skaicuotuvas) {
        return skaicuotuvas.skaicius1 * skaicuotuvas.skaicius2;
    }

    public static double dalyba(Skaicuotuvas skaicuotuvas) {
        return skaicuotuvas.skaicius1 / skaicuotuvas.skaicius2;
    }

    public static double liekana(Skaicuotuvas skaicuotuvas) {
        return skaicuotuvas.skaicius1 % skaicuotuvas.skaicius2;
    }

    public static int veiksmai(Skaicuotuvas skaicuotuvas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(skaicuotuvas.skaicius1
                + "\nPasirinkite koki veiksma norite atlikti"
                + "\nSpauskite 1 noredami atlikti sudeties veiksma"
                + "\nSpauskite 2 noredami atlikti atimties veiksma"
                + "\nSpauskite 3 noredami atlikti daugybos veiksma"
                + "\nSpauskite 4 noredami atlikti dalybos veiksma"
                + "\nSpauskite 5 noredami atlikti dalybos su liekana veiksma"
                + "\nSpauskite 6 noredami istrinti dabbartine reikme"
                + "\nSpauskite 7 noredami iseiti");
        return scanner.nextInt();
    }

    public static void paleidimas(Skaicuotuvas skaicuotuvas) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = veiksmai(skaicuotuvas);
        while (pasirinkimas != 7) {
            switch (pasirinkimas) {
                case 1 -> {
                    System.out.println(skaicuotuvas.skaicius1 + " + ");
                    skaicuotuvas.skaicius2 = scanner.nextDouble();
                    skaicuotuvas.skaicius1 = sudetis(skaicuotuvas);
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                case 2 -> {
                    System.out.println(skaicuotuvas.skaicius1 + " - ");
                    skaicuotuvas.skaicius2 = scanner.nextDouble();
                    skaicuotuvas.skaicius1 = atimtis(skaicuotuvas);
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                case 3 -> {
                    System.out.println(skaicuotuvas.skaicius1 + " * ");
                    skaicuotuvas.skaicius2 = scanner.nextDouble();
                    skaicuotuvas.skaicius1 = daugyba(skaicuotuvas);
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                case 4 -> {
                    System.out.println(skaicuotuvas.skaicius1 + " / ");
                    skaicuotuvas.skaicius2 = scanner.nextDouble();
                    skaicuotuvas.skaicius1 = dalyba(skaicuotuvas);
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                case 5 -> {
                    System.out.println(skaicuotuvas.skaicius1 + " % ");
                    skaicuotuvas.skaicius2 = scanner.nextDouble();
                    skaicuotuvas.skaicius1 = liekana(skaicuotuvas);
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                case 6 -> {
                    skaicuotuvas.skaicius1 = 0;
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
                default -> {
                    System.out.println("Ivedete neteisinga komanda");
                    pasirinkimas = veiksmai(skaicuotuvas);
                }
            }
        }
    }

    public static void main(String[] args) {
        Skaicuotuvas skaicuotuvas = new Skaicuotuvas();
        paleidimas(skaicuotuvas);
    }
}
