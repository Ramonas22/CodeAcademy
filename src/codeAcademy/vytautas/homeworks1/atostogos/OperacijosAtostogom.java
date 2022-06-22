package codeAcademy.vytautas.homeworks1.atostogos;

class OperacijosAtostogom {

    public boolean arTasPatsMenesis(Atostogos atostogos1, Atostogos atostogos2){
        return (atostogos1.getMenesis().equalsIgnoreCase(atostogos2.getMenesis()));
    }

    public int atostoguVidurkis(Atostogos[] atsotogos){
        int vidurkis = 0;
        for (Atostogos atostogos: atsotogos
        ) {
            vidurkis+=atostogos.getDienuSkaicius();
        }
        return vidurkis/atsotogos.length;
    }
}
