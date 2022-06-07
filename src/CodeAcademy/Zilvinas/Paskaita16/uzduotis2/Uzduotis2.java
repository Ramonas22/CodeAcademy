package CodeAcademy.Zilvinas.Paskaita16.uzduotis2;

import java.util.Scanner;

class Uzduotis2 {

    public static void main(String[] args) {
        palindromai();
    }
    static void palindromai(){
        Scanner palindromai = new Scanner(System.in);

        System.out.println("Iveskite zodi kuri norite tikrinti ar jis palindromas");
        StringBuilder zodis = new StringBuilder(palindromai.next());
        if(String.valueOf(zodis).equals(String.valueOf(zodis.reverse()))){
            System.out.println(zodis + " yra palindromas");
        }else {
            System.out.println(String.valueOf(zodis.reverse()) + " nera palindromas, atvirksciai jis yra " + zodis.reverse());
        }
    }
}
