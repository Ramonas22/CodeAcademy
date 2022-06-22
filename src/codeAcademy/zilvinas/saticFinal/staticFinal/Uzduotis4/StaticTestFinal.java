package codeAcademy.zilvinas.saticFinal.staticFinal.Uzduotis4;

class StaticTestFinal {
    private static final int pirmas = 0;
    private static int antras;


    void priskirk(int antras){
        //StaticTestFinal.pirmas = pirmas;
        StaticTestFinal.antras = antras;

        System.out.println("Pirmas " + StaticTestFinal.pirmas);
        System.out.println("Antras " + StaticTestFinal.antras);
    }
}
