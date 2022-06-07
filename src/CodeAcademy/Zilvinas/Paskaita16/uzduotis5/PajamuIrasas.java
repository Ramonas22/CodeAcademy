package CodeAcademy.Zilvinas.Paskaita16.uzduotis5;


import lombok.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Data
class PajamuIrasas {
    private double suma;
    private int kategorijosIndekasas;
    private LocalDateTime data;
    private String pozymis;
    private String papildomaInfo;

}
