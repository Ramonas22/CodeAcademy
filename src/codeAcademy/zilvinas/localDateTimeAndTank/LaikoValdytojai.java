package codeAcademy.zilvinas.localDateTimeAndTank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class LaikoValdytojai {

    public static void main(String[] args) {
        //ikiPirmosUzduoties();
        //ikiAntrosUzduoties();
        palyginimas();

    }

    private static void ikiPirmosUzduoties(){
        LocalDateTime Zilean = LocalDateTime.now();
        System.out.println(Zilean.getDayOfMonth() + "\n" + Zilean.getHour()
                + "\n" + Zilean.getMonth());

        LocalDate data = Zilean.toLocalDate();

        System.out.println(data);

        LocalDateTime Zilean2 = Zilean.plusDays(65);

        System.out.println(Zilean2);

        String formaterisToday = data.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formaterisToday);

        DateTimeFormatter fermeris = DateTimeFormatter.ofPattern("yyyy!!MM!!dd");
        System.out.println(data.format(fermeris));
    }

    private static void ikiAntrosUzduoties(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("Iveskite laika: (formatas HH:mm)");
        String laikas = scanner.next();
        scanner.close();

        LocalTime dabartinisLaikas = LocalTime.parse(laikas , f);

        System.out.println("Ivestas laikas " + dabartinisLaikas);

        System.out.println("pridejus viena valanda bus: " + dabartinisLaikas.plusHours(1));
    }

    private static void palyginimas(){
        LocalDate zalgirioMusys = LocalDate.of(1410 , 7 , 15);
        LocalDate saulesMusys = LocalDate.of(1236 , 9, 22);

        if(zalgirioMusys.isAfter(saulesMusys)){
            System.out.println("Saules musys ivyko pries zalgirio musy");
        }else {
            System.out.println("Zalgyrio musys ivyko pries saules musy");
        }

        //Pradzioje lyginima metus tada menesius ir tada dienas ir grazina rezultata iki pirmo ne 0
        int rezultatuPalyginimas = zalgirioMusys.compareTo(saulesMusys);

        System.out.println("Palyginus zalgirio musy su saules musiu gautas ats: " + rezultatuPalyginimas);
        if(rezultatuPalyginimas == 0){
            System.out.println("Musiai ivyko tuo paciu metu");
        }else if(rezultatuPalyginimas > 0){
            System.out.println("Zalgirio musys ivyko veliau");
        }else {
            System.out.println("Saules musys ivyko veliau");
        }
    }



}
