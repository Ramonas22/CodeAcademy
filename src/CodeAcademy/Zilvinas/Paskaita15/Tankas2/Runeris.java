package CodeAcademy.Zilvinas.Paskaita15.Tankas2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Runeris {


    public static void main(String[] args) {
        zaidimas();
    }

    private static void zaidimas(){
        TankoKomandos komandos = new TankoKomandos();
        Scanner tankoSkeneris= new Scanner(System.in);
        DateTimeFormatter formateris = DateTimeFormatter.ofPattern("[HH:mm]");
        Tankas tankas = new Tankas();
        boolean runeris = true;

        while (runeris){
            System.out.println("""
                    Pasirinkite:\s
                    [s]- ejimas i Siaure
                    [r]- ejimas i Rytus
                    [p]- ejimas i Pietus
                    [v]- ejimas i Vakarus
                    [*]- suvis
                    [i]- info
                    [x]- pabaiga
                    """);
            switch (tankoSkeneris.next()){
                case "s" -> {
                    komandos.pirmyn(tankas);
                    System.out.println(LocalTime.parse(LocalTime.now().format(formateris)) + " Tankas pajuda i Siaure" + komandos.tankoKoordinates(tankas));
                }
                case "r"-> {
                    komandos.desinen(tankas);
                    System.out.println(LocalTime.parse(LocalTime.now().format(formateris)) + " Tankas pajuda i Rytus" + komandos.tankoKoordinates(tankas));
                }
                case "p"->{
                    komandos.atgal(tankas);
                    System.out.println(LocalTime.parse(LocalTime.now().format(formateris)) + "Tankas pajuda i Pietus" + komandos.tankoKoordinates(tankas));
                }
                case "v"->{
                    komandos.kairen(tankas);
                    System.out.println(LocalTime.parse(LocalTime.now().format(formateris)) + "Tankas pajuda i Vakarus" + komandos.tankoKoordinates(tankas));
                }
                case "*"->{
                    komandos.saudyti(tankas);
                    System.out.println(LocalTime.parse(LocalTime.now().format(formateris)) + "Tankas sove i " + tankas.kryptis + komandos.tankoKoordinates(tankas));
                }
                case "i"-> komandos.info(tankas);
                case "x"->runeris = false;
                default -> System.out.println("Ivesta neteisinga komanda");
            }
        }
    }
}
