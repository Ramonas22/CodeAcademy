package CodeAcademy.Vytautas.klasiuKovos.poPetraikos;

public class executor {

    public static void main(String[] args) {

        Figura kvadratas = new Figura();
        kvadratas.setPavadinimas("Kvadratas");
        kvadratas.setKampuSkaicius(4);
        kvadratas.setPerimetras(42);
        kvadratas.setPlotas(46);

        Figura kvadratas2 = new Figura("Apskirtimas", 0, 12, 16);

        Figura kvadratas3 = new Figura(
                kvadratas.getPavadinimas(),   //Pavadinimas
                kvadratas.getKampuSkaicius(), //Kampu skaicius
                kvadratas.getPerimetras(),    //Perimetras
                kvadratas.getPlotas());       //Plotas

        Figura kvadratas4 = new Figura();
        kvadratas4.papildykFigura();

        kvadratas.spausdkin();
        kvadratas2.spausdkin();
        kvadratas3.spausdkin();
        kvadratas4.spausdkin();
    }
}
