package codeAcademy.vytautas.homeworks1.filmas;

import lombok.Data;

@Data
class Filmas {
    private String pavadinimas;
    private String zanras;
    private double reitingas;

    Filmas(String pavadinimas, String zanras, double reitingas){
        setPavadinimas(pavadinimas);
        setZanras(zanras);
        setReitingas(reitingas);
    }

    public void spausdinkInfo(){
        System.out.println("Filmo pavadinimas: " + getPavadinimas() + " "
                    +"zanras: " + getZanras() + " "
                    +"reitingas: " + getReitingas() + " ");
    }

}
