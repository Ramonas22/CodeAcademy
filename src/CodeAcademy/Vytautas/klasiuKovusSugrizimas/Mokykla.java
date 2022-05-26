package CodeAcademy.Vytautas.klasiuKovusSugrizimas;

public class Mokykla {

    public static void main(String[] args) {

        KomandosKlasem komandos = new KomandosKlasem();
        Studentas[] klase4B = new Studentas[3];
        //Studentas[] klase4A = komandos.uzpildykKlase();

        klase4B[0] = new Studentas(88, 38802124587L, "Marijonas", "Mickas", new int[]{8, 5, 9, 8, 10});
        klase4B[1] = new Studentas(90, 49705128587L, "Marija", "Stolpiene", new int[]{10, 8, 9, 9, 10});
        klase4B[2] = new Studentas(75, 39902124587L, "Igoris", "Pavel", new int[]{7, 5, 7, 8, 6});

        /*
        //Rankinis suvedimas
        for (Studentas studentas : klase4B) {
            studentas.suveskStudentoInfo();
        }
        */

        komandos.spausdintiGrupe(klase4B);

        komandos.rusiuokNuoDidziausioIkiMaziausio(klase4B);

        komandos.spausdintiGrupe(klase4B);

        komandos.rusiuokNuoMaziausioIkiDidziausio(klase4B);

        komandos.spausdintiGrupe(klase4B);

    }
}
