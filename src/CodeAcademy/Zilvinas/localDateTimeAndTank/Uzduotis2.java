package CodeAcademy.Zilvinas.localDateTimeAndTank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Uzduotis2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String laikinas;

        DateTimeFormatter laikoFormateris = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Iveskite laika formatu MM:mm : ");
        laikinas = scanner.next();

        LocalTime laikas = LocalTime.parse(laikinas , laikoFormateris);

        System.out.println("Ivestas laikas " + laikas);
        laikas = laikas.plusHours(2).plusMinutes(15);
        System.out.println("Prie ivesto laiko pridejus 2 val 15 min gauname " + laikas);


        if(laikas.compareTo(LocalTime.parse(LocalTime.now().format(laikoFormateris))) > 0){
            System.out.println("Suskaiciuotas laikas yra velyvesnis uz dabartini laika");
        }else if(laikas.compareTo(LocalTime.parse(LocalTime.now().format(laikoFormateris))) == 0){
            System.out.println("Suskaiciuotas laikas sutampa su dabartiniu laiku");
        }else {
            System.out.println("Dabartinsi laikas yra velyvesnis uz suskaiciuota laika");
        }
    }
}
