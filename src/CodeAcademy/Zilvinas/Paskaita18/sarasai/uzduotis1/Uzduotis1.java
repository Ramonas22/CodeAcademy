package CodeAcademy.Zilvinas.Paskaita18.sarasai.uzduotis1;

import java.util.ArrayList;
import java.util.Scanner;

public class Uzduotis1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringSarasas= new ArrayList<>();
        int tempInt;
        String tempString;

        while (true){
            System.out.println("Noredami prideti zodi i sarasa spauskite 1, noredami iseiti 2");
            tempInt = scanner.nextInt();
            if(tempInt==1){
                System.out.println("Iveskite zodi");
                tempString = scanner.next();
                while (true){
                    if(stringSarasas.contains(tempString)){
                        System.out.println("Iveskite kita zodi, kadangi toks zodis jau yra sarase");
                        tempString = scanner.next();
                    }else {
                        stringSarasas.add(tempString);
                        break;
                    }
                }
            } else if (tempInt == 2) {
                break;
            }else {
                System.out.println("Ivedete neteisinga komanda");
            }
            if(stringSarasas.size() >= 5){
                stringSarasas.clear();
            }
        }

        System.out.println("Sarase yra: " + stringSarasas);
    }
}
