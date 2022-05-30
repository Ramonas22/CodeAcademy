package CodeAcademy.Zilvinas.Paskaita14.StaticFinal.Uzduotis2;

public class PirmaKlase {
    static int statinisKitnamasis = 1;
    PirmaKlase(){
        System.out.println(statinisKitnamasis);
        statinisKitnamasis++;
    }
    static void Isvalyti(){
        System.out.println(statinisKitnamasis);
        statinisKitnamasis = 0;
    }
}
