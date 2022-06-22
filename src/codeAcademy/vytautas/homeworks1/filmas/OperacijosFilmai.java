package codeAcademy.vytautas.homeworks1.filmas;

class OperacijosFilmai {

    public Filmas geriausiasFilmas(Filmas[] filmai){
        int indeksas=0;
        for (int i = 1; i < filmai.length; i++) {
            if (filmai[indeksas].getReitingas() > filmai[i].getReitingas()){
                indeksas = i;
            }
        }
        return filmai[indeksas];
    }

    public Filmas blogiausiasFilmas(Filmas[] filmai){
        int indeksas = 0;
        for (int i = 1; i < filmai.length; i++) {
            if(filmai[indeksas].getReitingas() < filmai[i].getReitingas()){
                indeksas = i;
            }
        }
        return filmai[indeksas];
    }

    public Filmas[] siauboFilmai(Filmas[] filmai){
        Filmas[] siauboFilmai1 = new Filmas[filmai.length];
        int indeksas = 0;

        for (Filmas filmas : filmai) {
            if (filmas.getZanras().equalsIgnoreCase("siaubo")) {
                siauboFilmai1[indeksas] = filmas;
                indeksas++;
            }
        }
        Filmas[] siauboFilmai2 = new Filmas[indeksas];
        for (int i = 0; i < siauboFilmai2.length; i++) {
            siauboFilmai2[i] = siauboFilmai1[i];
        }
        return siauboFilmai2;
    }
}
