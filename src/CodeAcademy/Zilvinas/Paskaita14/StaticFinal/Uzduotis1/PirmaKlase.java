package CodeAcademy.Zilvinas.Paskaita14.StaticFinal.Uzduotis1;

class PirmaKlase {
    int neStatinis = 1;

    public void setNeStatinis(int i ){
        System.out.println(i);
        neStatinis = i;
    }

    public static void staticMethod(int j){
        System.out.println(j);
        PirmaKlase pirmaKlase = new PirmaKlase();
        pirmaKlase.neStatinis = j;
    }
}
