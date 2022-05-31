package CodeAcademy.Zilvinas.Paskaita15.Tankas2;

public class TankoKomandos {
    public void pirmyn(Tankas tankas) {
        tankas.kryptis = tankas.kryptisMas[0];
        tankas.koordinates[0] += 1;
    }

    public void desinen(Tankas tankas) {
        tankas.kryptis = tankas.kryptisMas[1];
        tankas.koordinates[1] += 1;
    }

    public void atgal(Tankas tankas) {
        tankas.kryptis = tankas.kryptisMas[2];
        tankas.koordinates[2] += 1;
    }

    public void kairen(Tankas tankas) {
        tankas.kryptis = tankas.kryptisMas[3];
        tankas.koordinates[3] += 1;
    }

    public void saudyti(Tankas tankas) {
        switch (tankas.kryptis) {
            case "SIAURE" -> tankas.suviai[0] += 1;
            case "RYTAI" -> tankas.suviai[1] += 1;
            case "PIETUS" -> tankas.suviai[2] += 1;
            case "VAKARAI" -> tankas.suviai[3] += 1;
        }
    }

    private int atliktiSuviai(Tankas tankas) {
        int isviso = 0;
        for (int suvis : tankas.suviai
        ) {
            isviso += suvis;
        }
        return isviso;
    }

    public void info(Tankas tankas) {
        System.out.println("\n");

        System.out.println("INFO: Tanko koordinates: "+ tankoKoordinates(tankas) +", krytpis: " + tankas.kryptis);

        System.out.println("INFO: Tanko suviai i salis: ");
        for (int i = 0; i < tankas.suviai.length; i++) {
            System.out.print(tankas.kryptisMas[i] + " " + tankas.suviai[i] + ", ");
        }
        System.out.println("Is viso padaryta suviu: " + atliktiSuviai(tankas));
    }
    public String tankoKoordinates(Tankas tankas){
        return "("+(tankas.koordinates[2] - tankas.koordinates[1]) + "," + (tankas.koordinates[0] + tankas.koordinates[3]) +")";
    }
}
