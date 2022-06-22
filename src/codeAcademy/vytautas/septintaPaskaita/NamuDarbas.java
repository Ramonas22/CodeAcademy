package codeAcademy.vytautas.septintaPaskaita;

import java.util.Scanner;

class NamuDarbas {

    public static void main(String[] args) {
        rusiavimas();
    }

    protected static void rusiavimas() {
        Scanner scanner = new Scanner(System.in);

        int[] sarasas = new int[6];
        int laikinas;

        for (int i = 0; i < sarasas.length; i++) {
            System.out.println("Ivesktie " + (i + 1) + " skaicius");
            sarasas[i] = scanner.nextInt();
        }

        for (int i = 0; i < sarasas.length; i++) {
            for (int j = 0, enchanted = i; j < (sarasas.length - enchanted - 1); j++) {
                if (sarasas[j] > sarasas[j + 1]) {
                    laikinas = sarasas[j + 1];
                    sarasas[j + 1] = sarasas[j];
                    sarasas[j] = laikinas;
                    enchanted = i;
                }else{
                    enchanted +=1;
                }
            }
        }
        for (int skaicius : sarasas) {
            System.out.println(skaicius);
        }
    }
}
