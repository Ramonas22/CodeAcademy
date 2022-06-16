package CodeAcademy.Zilvinas.Paskaita8;

class Darbuotojas {

    private int atlyginimas;
    private int darbas;

    public Darbuotojas() {
        atlyginimas = 900;
        darbas = 480;
    }

    public Darbuotojas(int atlyginimas, int darbas) {
        this.atlyginimas = atlyginimas;
        this.darbas = darbas;
    }


    public void gautiInfo() {
        System.out.println("Atlyginimas " + getAtlyginimas() + " dirbtos valandos: " + getDarbas());
    }

    public void pridetiAtlyginima() {
        if (getAtlyginimas() < 500) {
            setAtlyginimas(getAtlyginimas() + 10);
        }
    }

    public void pridetiDarba(int virsvalandziai) {
        setAtlyginimas(getAtlyginimas() + 5);
        setDarbas(getDarbas() + virsvalandziai);
    }

    protected void apsaugotasMetodas() {
        System.out.println("Apsaugotas metodas");
    }

    void privatausPaketoMetodas() {
        System.out.println("Metodas kur igal ikviest tik tam paciam pakete");
    }

    private int getAtlyginimas() {
        return atlyginimas;
    }

    private void setAtlyginimas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    private int getDarbas() {
        return darbas;
    }

    private void setDarbas(int darbas) {
        this.darbas = darbas;
    }

}
