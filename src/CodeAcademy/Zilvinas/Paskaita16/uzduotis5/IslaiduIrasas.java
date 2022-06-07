package CodeAcademy.Zilvinas.Paskaita16.uzduotis5;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Data
class IslaiduIrasas {
    private double suma;
    private int kategorijosIndeksas;
    private LocalDateTime dataLaikas;
    private String atsiskaitymoBudas;
    private String kokiaBankoKortele;

}
