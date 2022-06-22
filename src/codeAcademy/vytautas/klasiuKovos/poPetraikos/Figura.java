package codeAcademy.vytautas.klasiuKovos.poPetraikos;

import java.util.Scanner;

class Figura {

    private String pavadinimas;
    private int kampuSkaicius;
    private double perimetras;
    private double plotas;
    Figura(){}
    Figura(String pavadinimas, int kampuSkaicius, double perimetras, double plotas){
        setPavadinimas(pavadinimas);
        setKampuSkaicius(kampuSkaicius);
        setPerimetras(perimetras);
        setPlotas(plotas);
    }


    public void papildykFigura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesk figuros pavadinima");
        setPavadinimas(scanner.nextLine());

        System.out.println("Ivesk figuros kampu skaiciu");
        setKampuSkaicius(scanner.nextInt());

        System.out.println("Ivesk figuros perimetra");
        setPerimetras(scanner.nextDouble());

        System.out.println("Ivesk figuros plotra");
        setPlotas(scanner.nextDouble());

    }

    public void spausdkin(){
        System.out.println(getPavadinimas() + " , kampu skaicius " + getKampuSkaicius()
                + " , perimetras " + getPerimetras() + " , plotas " + getPlotas());
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getKampuSkaicius() {
        return kampuSkaicius;
    }

    public void setKampuSkaicius(int kampuSkaicius) {
        this.kampuSkaicius = kampuSkaicius;
    }

    public double getPerimetras() {
        return perimetras;
    }

    public void setPerimetras(double perimetras) {
        this.perimetras = perimetras;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }
}
