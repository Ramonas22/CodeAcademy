package codeAcademy.zilvinas.uzduotys;

import java.util.Scanner;

class Trecias {
    public static void main(String[] args){
        /*Parašyti programą, kuri paprašytu įvest 5 kartus skaičių ir išspausdintų jų sumą.
        Pasinaudojant:  Scanner scanner = new Scanner(System.in);
        int sk1 = scanner.nextInt();
        Papildomai: parašyti su ciklu.
         */
        Scanner scanner = new Scanner(System.in);
        int sk1 =0;
        for(int i =0;i<5;i++){
            System.out.println("Iveskite " + i +1 +" skaiciu: ");
            sk1 += scanner.nextInt();
        }
        System.out.println("Jusu ivestu skaiciu suma: " + sk1);
    }
}
