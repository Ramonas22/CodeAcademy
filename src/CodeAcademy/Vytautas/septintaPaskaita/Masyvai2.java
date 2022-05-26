package CodeAcademy.Vytautas.septintaPaskaita;

import java.util.Random;
import java.util.Scanner;

public class Masyvai2 {

    public static void main(String[] args) {

    }

    protected static void pirmaUzduotis() {
        Scanner skarneris = new Scanner(System.in);

        System.out.println("Kiek skaiciu noresi ivest? ");
        int[] masvyas = new int[skarneris.nextInt()];

        for (int i = 0; i < masvyas.length; i++) {
            System.out.println("Iveskite " + (i +
                    1) + " skaiciu");
            masvyas[i] = skarneris.nextInt();
        }

        for (int i = masvyas.length - 1; i >= 0; i--) {
            System.out.println(masvyas[i]);
        }

    }

    protected static void antraUzduotis() {
        Scanner zed = new Scanner(System.in);

        double x1, x2, D, a, b, c;

        System.out.println("Ivesk a");
        a = zed.nextDouble();

        System.out.println("Ivesk b");
        b = zed.nextDouble();

        System.out.println("Ivesk c");
        c = zed.nextDouble();

        if (a != 0 && b != 0 && c != 0) {
            D = Math.pow(b, 2) - 4 * a * c;

            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("X1 = " + x1 + " , X2 = " + x2);
            } else if (D == 0) {
                x1 = -(b / (2 * a));
                System.out.println("X = " + x1);
            } else {
                System.out.println("Sprendiniu nera");
            }
        }
    }

    protected static void treciaUzduotis() {
        Scanner jinx = new Scanner(System.in);
        Random randomizer = new Random();

        int atspekMane = randomizer.nextInt(101);
        int laikinas;

        System.out.println("Bandyk atspeti skaiciu :D, ivesk koki nors :)");
        laikinas = jinx.nextInt();

        while (true) {
            if (laikinas == atspekMane) {
                System.out.println("Nice tau pavyko !");
                break;
            } else if (laikinas > atspekMane) {
                System.out.println("Per didelis banndyk, dar karta");
                laikinas = jinx.nextInt();
            } else {
                System.out.println("Per mazas, bandyk dar karta");
                laikinas = jinx.nextInt();
            }
        }
    }

    protected static int[] sukurkMasyva() {
        Scanner tristana = new Scanner(System.in);

        System.out.println("Kokio dydzio masyva kursime ?");
        int[] masyvas = new int[tristana.nextInt()];

        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Ivesk " + (i + 1) + " masyvo skaiciu");
            masyvas[i] = tristana.nextInt();
        }
        return masyvas;
    }
}
