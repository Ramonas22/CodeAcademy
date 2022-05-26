package CodeAcademy.Zilvinas.Uzduotys;


public class Ketvirtas {
    /*
    Klase: Telefonas (Marke, modelis, atmintis, spalva) parodyk();

    Klase Telefonas;
    Kitnamieji marke, modelis, atmintis, spalva;
    MEtodas parodyk() - turi isspausdinti kintamuju visas reiksmes.
     */

    public static void main(String[] args) {
        Telefonas telefonas = new Telefonas();
        telefonas.parodyk();
        Telefonas telefonas2 = new Telefonas("Samsung", "S11100", 123, "Balta");
        telefonas2.parodyk();

    }

    public static class Telefonas {
        String marke;
        String modelis;
        int atmintis;
        String spalva;

        private String getMarke() {
            return marke;
        }

        private void setMarke(String marke) {
            this.marke = marke;
        }

        private String getModelis() {
            return modelis;
        }

        private void setModelis(String modelis) {
            this.modelis = modelis;
        }

        private int getAtmintis() {
            return atmintis;
        }

        private void setAtmintis(int atmintis) {
            this.atmintis = atmintis;
        }

        private String getSpalva() {
            return spalva;
        }

        private void setSpalva(String spalva) {
            this.spalva = spalva;
        }

        public Telefonas() {
            marke = "Nokia";
            modelis = "3310";
            atmintis = 125;
            spalva = "Juoda";
        }

        public Telefonas(String marke, String modelis, int atmintis, String spalva) {
            setMarke(marke);
            setModelis(modelis);
            setAtmintis(atmintis);
            setSpalva(spalva);
        }

        public void parodyk() {
            System.out.println(getMarke() + " " + getModelis() + " " + getAtmintis() + " " + getSpalva());
        }
    }
}
