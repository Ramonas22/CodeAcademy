package CodeAcademy.Zilvinas.saticFinal.StaticFinal.Uzduotis3;

class TestFinal {
    private final int pirmasKitnamasis;
    private int antrasKintamasis;

    public TestFinal(int pirmasKitnamasis){
        this.pirmasKitnamasis = pirmasKitnamasis;
    }
    public TestFinal(){
        this.pirmasKitnamasis = 4;
    }

    protected void keisti(int antrasKintamasis){
        this.antrasKintamasis = antrasKintamasis;
        System.out.println("Pirmas " + this.pirmasKitnamasis);
        System.out.println("Antras " + this.antrasKintamasis);
    }
}
