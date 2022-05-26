package CodeAcademy.Zilvinas.Papildomai.Saskaita;

import java.util.Scanner;

public class BankoSaskaitos {
    private static int idCount = 0;

    public static void main(String[] args) {

        Saskaita[] saskaitos = new Saskaita[100];

        pirmoLygioMeniu(saskaitos);

    }


    static class Saskaita {
        int ID;
        String vardas;
        int suma;

        Saskaita(int id, String vardas) {
            this.ID = id;
            this.vardas = vardas;
            suma = 0;
        }
    }

    public static void inestiOperacija(Saskaita saskaita) {

        Scanner scanner = new Scanner(System.in);

        int pasirinkimas = apklausaInesimui();
        switch (pasirinkimas) {
            case 1 -> saskaita.suma += 100;
            case 2 -> saskaita.suma += 50;
            case 3 -> saskaita.suma += 20;
            case 4 -> saskaita.suma += 10;
            case 5 -> saskaita.suma += 5;
            case 6 -> {
                System.out.println("Ivesktie norima inesti pinigu suma: ");
                int piniguSumaKita = scanner.nextInt();
                if (piniguSumaKita > 0) {
                    saskaita.suma += piniguSumaKita;
                } else {
                    System.out.println("Negalima inesti neigiama pinigu suma");
                }
            }
            default -> System.out.println("Ivedete neteisinga pasirinkima");
        }

    }

    public static void issimtiOperacija(Saskaita saskaita) {
        Scanner scanner = new Scanner(System.in);

        int pasirikimas = apklausaIssimti();

        switch (pasirikimas) {
            case 1 -> {
                if (saskaita.suma > 100) {
                    saskaita.suma -= 100;
                }
            }
            case 2 -> {
                if (saskaita.suma > 50) {
                    saskaita.suma -= 50;
                }
            }
            case 3 -> {
                if (saskaita.suma > 20) {
                    saskaita.suma -= 20;
                }
            }
            case 4 -> {
                if (saskaita.suma > 10) {
                    saskaita.suma -= 10;
                }
            }
            case 5 -> {
                if (saskaita.suma > 5) {
                    saskaita.suma -= 5;
                }
            }
            case 6 -> {
                System.out.println("Iveskite kiek noreite isiimti pinigu");
                int kitaSuma = scanner.nextInt();
                if (kitaSuma <= saskaita.suma) {
                    saskaita.suma -= kitaSuma;
                } else {
                    System.out.println("Jus neturite tiek pinigu");
                }
            }
            default -> System.out.println("Ivestas neteisingas pasirinkimas");
        }
    }

    public static void likutis(Saskaita saskaita) {
        System.out.println(saskaita.suma);
    }

    public static int apklausaInesimui() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Iveskite kiek norite inesti:\s
                Spauskite 1 noredami inesti 100e
                Spauskite 2 noredami inesti 50e
                Spauskite 3 noredami inesti 20e
                Spauskite 4 noredami inesti 10e
                Spauskite 5 noredami inesti 5e
                Spauskite 6 noredami inesti kita suma""");
        return scanner.nextInt();
    }

    public static int apklausaIssimti() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Iveskite kiek norite inesti:\s
                Spauskite 1 noredami isimti 100e
                Spauskite 2 noredami isimti 50e
                Spauskite 3 noredami isimti 20e
                Spauskite 4 noredami isimti 10e
                Spauskite 5 noredami isimti 5e
                Spauskite 6 noredami isimti kita suma""");
        return scanner.nextInt();
    }

    public static int pirmoLygioApklausa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Pasirinkite operacija:\s
                1.Prideti nauja vartotoja.
                2.Paziureti esamus vartotojus.
                3.Pasirinkti vartotoja.
                4.Pabaigti programa.""");
        return scanner.nextInt();
    }

    public static int antroLygioApkalusa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Iveskite skaiciu norimai operacija atlikti
                1. Inesti pinigu
                2. Isiimti pinigu
                3. likutis
                4. pervesti pinigu kitam vartotojui
                5. grizti atgal""");
        return scanner.nextInt();
    }

    public static int apklausaPavedimui(int ID, Saskaita[] visosSaskaitos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kam noreite pervesti pinigu: ");
        varotojuAtvaizdavimas(ID, visosSaskaitos);
        return scanner.nextInt() - 1;
    }

    public static void varotojuAtvaizdavimas(int ID, Saskaita[] visosSaskaitos) {
        for (int i = 0; i < idCount; i++) {
            if (i != ID) {
                System.out.println(i + 1 + ". " + visosSaskaitos[i].vardas);
            }
        }
    }

    public static void varotojuAtvaizdavimas(Saskaita[] visosSaskaitos) {
        for (int i = 0; i < idCount; i++) {
            System.out.println(i + 1 + ". " + visosSaskaitos[i].vardas);
        }
    }

    public static void sukurtiNaujaVartotoja(Saskaita[] visosSaskaitos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite naujo vartotojo varda");

        String vardas = scanner.next();

        Saskaita saskaita = new Saskaita(idCount, vardas);

        visosSaskaitos[idCount] = saskaita;
        idCount++;
    }

    public static int pasirinktiVartotoja(Saskaita[] visosSaskaitos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pasirinkite vartotoja is saraso: ");
        varotojuAtvaizdavimas(visosSaskaitos);
        return (scanner.nextInt() - 1);
    }

    public static void pavedimas(int vartotojas1, int vartotojas2, Saskaita[] visosSaskaitos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kiek pinigu norite pervesti: ");
        int pavedimoSuma = scanner.nextInt();
        if (pavedimoSuma <= visosSaskaitos[vartotojas1].suma) {
            visosSaskaitos[vartotojas2].suma += pavedimoSuma;
            visosSaskaitos[vartotojas1].suma -= pavedimoSuma;
        } else {
            System.out.println("Jus neturite tike pinigu");
        }

    }

    public static void pervedimasKitamVartotojui(int ID, Saskaita[] visosSaskaitos) {
        int pasirinkimas = apklausaPavedimui(ID, visosSaskaitos);
        if (pasirinkimas > 0 && pasirinkimas <= idCount - 1) {
            pavedimas(ID, pasirinkimas, visosSaskaitos);
        } else {
            System.out.println("Pasirinkote neteisinga vartotoja");
        }


    }

    public static void pirmoLygioMeniu(Saskaita[] saskaitos) {


        int pasirinkimas = pirmoLygioApklausa();
        while (pasirinkimas != 4) {
            switch (pasirinkimas) {
                case 1 -> {
                    sukurtiNaujaVartotoja(saskaitos);
                    pasirinkimas = pirmoLygioApklausa();
                }
                case 2 -> {
                    varotojuAtvaizdavimas(saskaitos);
                    pasirinkimas = pirmoLygioApklausa();
                }
                case 3 -> {
                    antroLygioMeniu(pasirinktiVartotoja(saskaitos), saskaitos);
                    pasirinkimas = pirmoLygioApklausa();
                }
                default -> {
                    System.out.println("Ivedete neteisigna komandos skaiciu");
                    pasirinkimas = pirmoLygioApklausa();
                }
            }
        }

    }

    public static void antroLygioMeniu(int vartotojoID, Saskaita[] visosSaskaitos) {

        Saskaita saskaita = visosSaskaitos[vartotojoID];
        int pasirinkimas = antroLygioApkalusa();

        while (pasirinkimas != 5) {
            switch (pasirinkimas) {
                case 1 -> {
                    inestiOperacija(saskaita);
                    pasirinkimas = antroLygioApkalusa();
                }
                case 2 -> {
                    issimtiOperacija(saskaita);
                    pasirinkimas = antroLygioApkalusa();
                }
                case 3 -> {
                    likutis(saskaita);
                    pasirinkimas = antroLygioApkalusa();
                }
                case 4 -> {
                    pervedimasKitamVartotojui(saskaita.ID, visosSaskaitos);
                    pasirinkimas = antroLygioApkalusa();
                }

                default -> {
                    System.out.println("Ivedete neteisinga komanda, bandykite dar karta.");
                    pasirinkimas = antroLygioApkalusa();
                }
            }
        }

    }


}