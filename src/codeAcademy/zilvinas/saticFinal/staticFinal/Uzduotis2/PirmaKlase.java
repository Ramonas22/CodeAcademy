package codeAcademy.zilvinas.saticFinal.staticFinal.Uzduotis2;

class PirmaKlase {
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
