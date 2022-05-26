package CodeAcademy.Zilvinas.Bankomatas3XD;

public class Bankomatas {
    private int eur100, eur50, eur20, eur10, eur5, kupiuruLimitas;

    Bankomatas(){
        eur100 = 0;
        eur50 = 0;
        eur20 = 0;
        eur10 = 0;
        eur5 = 0;
        kupiuruLimitas = 100;
    }

    public int getEur100() {
        return eur100;
    }

    public void setEur100(int eur100) {
        this.eur100 = eur100;
    }

    public int getEur50() {
        return eur50;
    }

    public void setEur50(int eur50) {
        this.eur50 = eur50;
    }

    public int getEur20() {
        return eur20;
    }

    public void setEur20(int eur20) {
        this.eur20 = eur20;
    }

    public int getEur10() {
        return eur10;
    }

    public void setEur10(int eur10) {
        this.eur10 = eur10;
    }

    public int getEur5() {
        return eur5;
    }

    public void setEur5(int eur5) {
        this.eur5 = eur5;
    }

    public int getKupiuruLimitas() {
        return kupiuruLimitas;
    }

    public void setKupiuruLimitas(int kupiuruLimitas) {
        this.kupiuruLimitas = kupiuruLimitas;
    }
}
