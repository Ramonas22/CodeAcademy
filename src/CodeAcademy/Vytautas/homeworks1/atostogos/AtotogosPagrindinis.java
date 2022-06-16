package CodeAcademy.Vytautas.homeworks1.atostogos;

class AtotogosPagrindinis {

    public static void main(String[] args){
        Atostogos atostogos1 = new Atostogos("Pavasario","Vasaris", 5);
        Atostogos atostogos2 = new Atostogos("Pavasario", "vasaris", 12);
        Atostogos atostogos = new Atostogos("Vasaros" , "liepa" , 20);

        OperacijosAtostogom operacijos = new OperacijosAtostogom();

        System.out.println(operacijos.arTasPatsMenesis(atostogos1,atostogos2));

        atostogos2.spausdinkInfo();

        Atostogos[] atostoguMasyvas = {atostogos, atostogos1, atostogos2};

        System.out.println("Atostogu vidurkis: " +  operacijos.atostoguVidurkis(atostoguMasyvas));

    }
}
