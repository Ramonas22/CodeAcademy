package CodeAcademy.Zilvinas.Bankomatas3XD;


public class Executer {


    public static void main(String[] args){

        Bankomatas bankomatas = new Bankomatas();
        BankomatoOperacijosVietines operacijos = new BankomatoOperacijosVietines();
        OperacijosPriejus priejus = new OperacijosPriejus();

        operacijos.nusatytiKiekBanknotuTilpsBankomate(bankomatas);

        Vartotojas[] vartotojai = operacijos.saskaituKurimas();

        priejus.screen0(bankomatas, vartotojai);

    }

}
