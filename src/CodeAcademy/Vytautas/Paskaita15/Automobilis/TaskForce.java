package CodeAcademy.Vytautas.Paskaita15.Automobilis;

class TaskForce {

    public static void main(String[] args) {
        Automobilis golf = new Automobilis("WV", 2010 , KebuloTipas.HECHBEKAS);
        Automobilis mazda = new Automobilis("Mazda", 2002, KebuloTipas.SEDANAS);
        Automobilis m3 = new Automobilis("BMW" , 2005 , KebuloTipas.SEDANAS);
        Automobilis volvo = new Automobilis("Volvo" , 2022, KebuloTipas.UNIVERSALAS);
        Automobilis Skyline = new Automobilis("Nissan" , 1973, KebuloTipas.SEDANAS);
        Automobilis CLA200 = new Automobilis("Mercedes-Benz", 2014, KebuloTipas.COUPE);

        Automobilis[] autoTurgus = {golf, mazda, m3, volvo, Skyline, CLA200};

        Automobilis[] atrinktiSedanai =  Automobilis.filtruotiPagalKebula(autoTurgus, KebuloTipas.SEDANAS);
        Automobilis.spausdinkAuto(atrinktiSedanai);

    }
}
