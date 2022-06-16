package CodeAcademy.Zilvinas.Uzduotys;

import java.util.Scanner;

class Penktas {
    /*
     *Klase: Pinigine
     * Metodai:
     * a.parodyk() isspausdina kitnamuju reiksmes
     * b.suma();- suskaiciuoja suma kiek yra pinigu;
     * c.inesti(eur100,eur50,eur20,eur10,eur5)
     *
     * Kintamieji eur100,eur50,eur20,eur10,eur5 laikys savyje kiek banknotu vienetu yra pinigineje
     */
    public static void main(String[] args) {
        Pinigine manoPinigine = new Pinigine();
        parodyk(manoPinigine);
        inesti(manoPinigine);
        parodyk(manoPinigine);
    }

    static class Pinigine {
        int eur100, eur50, eur20, eur10, eur5;

        Pinigine() {
            eur100 = 0;
            eur50 = 0;
            eur20 = 0;
            eur10 = 0;
            eur5 = 0;
        }
    }

    public static void parodyk(Pinigine pinigine) {
        System.out.println("100 euru banknotu yra: " + pinigine.eur100 + "\n50 euru banknotu yra: " + pinigine.eur50
                + "\n20 euru banknotu yra: " + pinigine.eur20 + "\n10 euru banknotu yra: " + pinigine.eur10
                + "\n5 euru banknotu yra: " + pinigine.eur5
                + "\nVisu banknotu suma = " + suma(pinigine));
    }

    public static int suma(Pinigine pinigine) {
        int suma = 0;
        suma = pinigine.eur100 * 100 + pinigine.eur50 * 50 + pinigine.eur20 * 20 + pinigine.eur10 * 10 + pinigine.eur5 * 5;
        return suma;
    }

    static int apklausaInesimui() {
        int pasirinkimas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pasirinkite koki veiksma norite atlikti: "
                + "\nSpauskite 1 noredami inesti 100 euru banknota"
                + "\nSpauskite 2 noredami inesti 50 euru banknota"
                + "\nSpauskite 3 noredami inesti 20 euru banknota"
                + "\nSpauskite 4 noredami inesti 10 euru banknota"
                + "\nSpauskite 5 noredami inesti 5 euru banknota"
                + "\nSpauskite 6 noredami iseiti");
        return pasirinkimas = scanner.nextInt();
    }

    public static void inesti(Pinigine pinigine) {
        Scanner scanner = new Scanner(System.in);
        int pasirinkimas = apklausaInesimui();
        while (pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1:
                    System.out.println("Kiek kupiuru 100 euru norite inesti: ");
                    pinigine.eur100 += scanner.nextInt();
                    pasirinkimas = apklausaInesimui();
                    break;
                case 2:
                    System.out.println("Kiek kupiuru 50 euru norite inesti: ");
                    pinigine.eur50 += scanner.nextInt();
                    pasirinkimas = apklausaInesimui();
                    break;
                case 3:
                    System.out.println("Kiek kupiuru 20 euru norite inesti: ");
                    pinigine.eur20 += scanner.nextInt();
                    pasirinkimas = apklausaInesimui();
                    break;
                case 4:
                    System.out.println("Kiek kupiuru 10 euru norite inesti: ");
                    pinigine.eur10 += scanner.nextInt();
                    pasirinkimas = apklausaInesimui();
                    break;
                case 5:
                    System.out.println("Kiek kupiuru 5 euru norite inesti: ");
                    pinigine.eur5 += scanner.nextInt();
                    pasirinkimas = apklausaInesimui();
                    break;
                default:
                    System.out.println("Ivedete neteisinga skaiciu");
                    pasirinkimas = apklausaInesimui();
                    break;
            }
        }
    }


}
