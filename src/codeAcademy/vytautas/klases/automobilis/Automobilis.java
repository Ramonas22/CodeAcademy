package codeAcademy.vytautas.klases.automobilis;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
class Automobilis {
    private String marke;
    private int pagaminimoMetai;
    KebuloTipas kebuloTipas;

    public static Automobilis @NotNull [] filtruotiPagalKebula(Automobilis[] autoTurgus, KebuloTipas tipas){
        int  counter= 0;
        for (Automobilis auto: autoTurgus
             ) {
            if(auto.kebuloTipas == tipas){
                counter++;
            }
        }
        Automobilis[] atrinktiAuto = new Automobilis[counter];
        counter = 0;
        for (int i = 0; i < autoTurgus.length; i++) {
            if(autoTurgus[i].kebuloTipas == tipas){
                atrinktiAuto[counter] = autoTurgus[i];
                counter++;
            }
        }
        System.out.println(tipas + " tipo automobiliu turguje yra: " + counter);

        return atrinktiAuto;
    }

    public static void spausdinkAuto(@NotNull Automobilis[] sarasas){
        for (Automobilis auto: sarasas
             ) {
            System.out.println("Automobilio marke " + auto.getMarke() + " pagaminimo metai " + auto.getPagaminimoMetai()
            + " kebulo tipas " + auto.getKebuloTipas());
        }
    }
}
