package CodeAcademy.Vytautas.klasiuKovos.intro;

class Figura {

    public Figura(){}

    public Figura(String pavadinimas){
        this.pavadinimas = pavadinimas;
    }

    public Figura(String pavadinimas, int kampuSkaicius, double perimetras, double plotas){
        this.pavadinimas = pavadinimas;
        this.kampuSkaicius = kampuSkaicius;
        this.perimetras = perimetras;
        this.plotas = plotas;
    }

    private String pavadinimas;
    private int kampuSkaicius;
    private double perimetras;
    private double plotas;

    public String getPavadinimas(){
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas){
        this.pavadinimas = pavadinimas;
    }

    public int getKampuSkaicius(){
        return kampuSkaicius;
    }

    public void setKampuSkaicius(int kampuSkaicius){
        this.kampuSkaicius = kampuSkaicius;
    }

    public double getPerimetras(){
        return perimetras;
    }

    public void setPerimetras(double perimetras){
        this.perimetras = perimetras;
    }

    public double getPlotas(){
        return plotas;
    }

    public void setPlotas(double plotas){
        this.plotas = plotas;
    }

}
