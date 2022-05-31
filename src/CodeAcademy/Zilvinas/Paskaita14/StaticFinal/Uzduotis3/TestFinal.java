package CodeAcademy.Zilvinas.Paskaita14.StaticFinal.Uzduotis3;

public class TestFinal {
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
