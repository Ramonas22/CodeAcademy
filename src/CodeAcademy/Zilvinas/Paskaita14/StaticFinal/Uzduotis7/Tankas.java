package CodeAcademy.Zilvinas.Paskaita14.StaticFinal.Uzduotis7;

public class Tankas {
    private final String kryptisMas[] = {"SIAURE", "RYTAI", "PIETUS", "VAKARAI"};
    private String kryptis = "SIAURE";
    private int koordinates[] = {0, 0, 0, 0};
    private int suviai[] = {0, 0, 0, 0};

    public void pirmyn() {
        kryptis = kryptisMas[0];
        koordinates[0] += 1;
    }

    public void desinen() {
        kryptis = kryptisMas[1];
        koordinates[1] += 1;
    }

    public void atgal() {
        kryptis = kryptisMas[2];
        koordinates[2] += 1;
    }

    public void kairen() {
        kryptis = kryptisMas[3];
        koordinates[3] += 1;
    }

    public void saudyti() {
        switch (kryptis) {
            case "SIAURE" -> {
                suviai[0] += 1;
            }
            case "RYTAI" -> {
                suviai[1] += 1;
            }
            case "PIETUS" -> {
                suviai[2] += 1;
            }
            case "VAKARAI" -> {
                suviai[3] += 1;
            }
        }
    }

    private int atliktiSuviai() {
        int isviso = 0;
        for (int suvis : suviai
        ) {
            isviso += suvis;
        }
        return isviso;
    }

    public void info() {
        System.out.println("\n");

        System.out.println("INFO: Tanko koordinates: (" + (koordinates[2] - koordinates[1]) + "," + (koordinates[0] + koordinates[3])
                + "), krytpis: " + kryptis);

        System.out.println("INFO: Tanko suviai i salis: ");
        for (int i = 0; i < suviai.length; i++) {
            System.out.print(kryptisMas[i] + " " + suviai[i] + ", ");
        }
        System.out.println(" Is viso padaryta suviu: " + atliktiSuviai());
    }
}
