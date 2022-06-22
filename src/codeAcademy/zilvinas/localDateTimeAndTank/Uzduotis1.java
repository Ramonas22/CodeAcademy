package codeAcademy.zilvinas.localDateTimeAndTank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Uzduotis1 {

    public static void main(String[] args) {
        LocalDateTime uzduotis1 = LocalDateTime.now();

        uzduotis1 = uzduotis1.minusHours(3);
        uzduotis1 = uzduotis1.plusDays(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");

        System.out.println(uzduotis1.format(formatter));
    }
}
