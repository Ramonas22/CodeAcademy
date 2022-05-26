package CodeAcademy.Vytautas.nebezinau;

import java.util.Scanner;


public class Logika {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu ");
        int skaicius1 = scanner.nextInt();

        /*System.out.println("Iveskite antra skaiciu ");
        int skaicius2 = scanner.nextInt();

        System.out.println("Iveskite trecia skaiciu ");
        int skaicius3 = scanner.nextInt();
        */
        System.out.println(salyga5(skaicius1));

    }

    public static boolean arLygu(int skaicius1, int skaicius2){

        if(skaicius1 == skaicius2 ){
            System.out.println("Skaiciai vienodi");
        }else{
            System.out.println("Skaiciai nevienodi");
        }
        return (skaicius1 == skaicius2);
    }
    public static boolean salyga1(int skaicius){
        boolean ats;
        if(((skaicius % 2) == 0)){
            System.out.println("Skaicius dalinasi is 2");
            ats = true;
        }else
        {
            System.out.println("skaicius nesidalina is 2");
            ats = false;
        }
        return ats;
    }
    public static boolean salyga2(int skaicius1, int skaicius2){
        boolean ats;
        if(skaicius1 != skaicius2){
            System.out.println("skaiciai nelygus");
            ats = true;
        }else{
            System.out.println("skaiciai yra lygus");
            ats = false;
        }
        return ats;
    }
    public static boolean salyga3(int skaicius){
        boolean ats;
        if(skaicius > 5 && ((skaicius %3) ==0)){
            System.out.println("skaicius didesnis uz 5 ir dalijasi is 3");
            ats = true;
        }else{
            System.out.println("skaicius nera didesnis uz 5 arba nesidalija is 3");
            ats = false;
        }
        return ats;
    }
    public static boolean salyga4(int skaicius1, int skaicius2, int skaicius3){
        boolean ats;
        if(((skaicius1 * skaicius1) == (skaicius2 * skaicius2 + skaicius3 * skaicius3))
                || ((skaicius2 * skaicius2) == (skaicius1 * skaicius1 + skaicius3 * skaicius3))
                || ((skaicius3 * skaicius3) == (skaicius1 * skaicius1 + skaicius2 * skaicius2))){
            System.out.println("Trikampis yra status");
            ats = true;
        }else{
            System.out.println("Trikampis nera status");
            ats = false;
        }
        return ats;
    }
    public static boolean salyga5(int skaicius){
        boolean ats;
        if(skaicius > 5 || ((skaicius %3) ==0)){
            System.out.println("skaicius didesnis uz 5 arba dalijasi is 3");
            ats = true;
        }else{
            System.out.println("skaicius nera didesnis uz 5 ir nesidalija is 3");
            ats = false;
        }
        return ats;
    }

}
