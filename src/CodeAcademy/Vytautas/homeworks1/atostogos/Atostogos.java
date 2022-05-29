package CodeAcademy.Vytautas.homeworks1.atostogos;

class Atostogos {
    private String pavadinimas;
    private String menesis;
    private int dienuSkaicius;


    Atostogos(String pavadinimas, String menesis, int dienuSkaicius){
        setPavadinimas(pavadinimas);
        setMenesis(menesis);
        setDienuSkaicius(dienuSkaicius);
    }

    public void spausdinkInfo(){
        System.out.println("Pavadinimas: " + getPavadinimas() + " "
                + "menesis " + getMenesis() + " "
                + "dienu skaicius " + getDienuSkaicius());
    }




    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getMenesis() {
        return menesis;
    }

    public void setMenesis(String menesis) {
        this.menesis = menesis;
    }

    public int getDienuSkaicius() {
        return dienuSkaicius;
    }

    public void setDienuSkaicius(int dienuSkaicius) {
        this.dienuSkaicius = dienuSkaicius;
    }
}
