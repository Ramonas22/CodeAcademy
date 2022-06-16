package CodeAcademy.Zilvinas.Bankomatas3XD;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class OperacijosPrisijungus {

    public void screen1(Bankomatas bankomatas, Vartotojas @NotNull [] vartotojai, int ID) {


        BankomatoOperacijosVietines operacijosVietines = new BankomatoOperacijosVietines();
        int pasirinkimas;
        Vartotojas vartotojas = vartotojai[ID];

        pasirinkimas = apklausaScreen1();

        while(pasirinkimas != 6) {
            switch (pasirinkimas) {
                case 1 -> {
                    operacijosVietines.pakeistiPIN(vartotojas);
                    pasirinkimas = apklausaScreen1();
                }
                case 2 -> {
                    operacijosVietines.saskaitosLikutis(vartotojas);
                    pasirinkimas = apklausaScreen1();
                }
                case 3 -> {
                    operacijosVietines.piniguInesimas(bankomatas, vartotojas);
                    pasirinkimas = apklausaScreen1();
                }
                case 4 -> {
                    vartotojai[ID] =  operacijosVietines.issimimas(bankomatas, vartotojas);
                    pasirinkimas = apklausaScreen1();
                }
                case 5 -> {
                    operacijosVietines.pavedimas(vartotojas, vartotojai);
                    pasirinkimas = apklausaScreen1();
                }

                default -> {
                    System.out.println("Ivedete neteisinga komanda");
                    pasirinkimas = apklausaScreen1();
                }
            }
        }
        vartotojai[ID] = vartotojas;
    }


    private int apklausaScreen1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Ivesktie numeri norimo atlikti veiksmo\s
                1. Pakeisti PIN
                2. Pasitikrinti saskaitos likuti
                3. Inesti pinigu
                4. Isiimti pinigu
                5. Pervesti draugui
                6. Iseiti
                """);
        return scanner.nextInt();
    }
}
