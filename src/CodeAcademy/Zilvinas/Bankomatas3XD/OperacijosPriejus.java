package CodeAcademy.Zilvinas.Bankomatas3XD;

import java.util.Scanner;

public class OperacijosPriejus {

    public void screen0(Bankomatas bankoamtas, Vartotojas[] vartotojas){
        int kintamasis;
        int ID;
        OperacijosPrisijungus prisijungus = new OperacijosPrisijungus();

        kintamasis = apklausa();
        while (kintamasis != 2){
            if (kintamasis == 1) {
                ID = pasirinkVartotoja(vartotojas) -1;
                System.out.println("Iveskite PIN");
                if(prisijungimasNaudojantPIN(vartotojas[ID])){
                    prisijungus.screen1(bankoamtas,vartotojas , ID);
                }
            } else {
                System.out.println("Ivesta neteisinga komanda");
            }
            kintamasis = apklausa();
        }

    }
    public boolean prisijungimasNaudojantPIN(Vartotojas vartotojas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            if (vartotojas.getPin() == scanner.nextInt()) {
                return true;
            } else {
                System.out.println("Ivedete neteisinga PIN, bandykite dar karta, liko : " + (3 - i) + " bandymai.");
            }
        }
        return false;
    }

    private int pasirinkVartotoja(Vartotojas[] vartotojas){
        Scanner scanner = new Scanner(System.in);
        int laikinas;

        while(true){
            System.out.println("Pasirinkite vartotoja is sarasao:");
            for (Vartotojas vartotoja : vartotojas) {
                System.out.println(vartotoja.getId() + 1);
            }
            laikinas = scanner.nextInt();
            if(laikinas>=0 && laikinas < vartotojas.length){
                return laikinas;
            }else {
                System.out.println("Neteisingas ID");
            }
        }

    }

    private int apklausa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Ivesktie numeri norimo atlikti veiksmo\s
                1. Pasirinkti vartotojui
                2. Iseiti
                """);
        return scanner.nextInt();
    }

}
