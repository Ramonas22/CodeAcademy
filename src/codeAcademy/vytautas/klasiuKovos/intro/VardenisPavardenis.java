package codeAcademy.vytautas.klasiuKovos.intro;

import lombok.Data;

@Data
class VardenisPavardenis {
    private String Vardas;
    private String Pavarde;
    private int amzius;


    public  VardenisPavardenis(){}

    public void spausdinkVardaSuPavarde(){
        System.out.println(getVardas() + " " + getPavarde());
    }
}
