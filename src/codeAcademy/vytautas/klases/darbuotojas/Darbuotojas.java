package codeAcademy.vytautas.klases.darbuotojas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Darbuotojas {

    private String vardas;
    private double alga;
    private int darboStazas;
    private int atostoguLikutis;
    private String pareigos;
    private final String darboviete;

    private Lytys lytis;

    public Darbuotojas(){
        this.darboviete = "Vasaros 5";
    }

    public Darbuotojas(String vardas, double alga, int darboStazas, int atostoguLikutis , String pareigos, Lytys lytis){
        this();
        this.vardas = vardas;
        this.alga = alga;
        this.darboStazas = darboStazas;
        this.atostoguLikutis = atostoguLikutis;
        this.pareigos = pareigos;
        this.lytis = lytis;
    }
    public void spausdink(){
        System.out.println("Vardas " + getVardas() + " alga " + getAlga() + " darbo stazas " + getDarboStazas()
        + " atostogu likutis " + getAtostoguLikutis() + " pareigos " + getPareigos() + " pareigos " + getPareigos()
        + " darboviete " + getDarboviete() + " lytis " + getLytis());
    }
}
