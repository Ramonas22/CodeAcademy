package CodeAcademy.Vytautas.Paskaita15.Darbuotojas;

public class Runeris {

    public static void main(String[] args) {
        Darbuotojas darbuotojas1 = new Darbuotojas();
        Darbuotojas darbuotojas2 = new Darbuotojas("Paulius", 850.25,2,20,"vairuotojas","Klinikos",Lytys.VYRAS);
        Darbuotojas darbuotojas3 = new Darbuotojas("Piteris", 1500.12,2,20,"Programuotojas",Lytys.VYRAS);

        darbuotojas1.setVardas("Aldona");
        darbuotojas1.setAlga(4000.21);
        darbuotojas1.setDarboStazas(20);
        darbuotojas1.setAtostoguLikutis(200);
        darbuotojas1.setPareigos("Direktore");
        darbuotojas1.setLytis(Lytys.MOTERIS);

        darbuotojas1.spausdink();
        darbuotojas2.spausdink();
        System.out.println(darbuotojas3.toString());



    }
}
