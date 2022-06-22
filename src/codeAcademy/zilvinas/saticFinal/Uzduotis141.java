package codeAcademy.zilvinas.saticFinal;

class Uzduotis141 {
    public static void main(String[] args){
        labas();
        labas(1, "Labas");
        labas("Labas" , 2);

    }

    static void labas(){
        System.out.println("Metodas be parametru");
    }
    static void labas(String a, int b){
        System.out.println(a + " " + b);
    }
    static void labas(int b, String a){
        System.out.println(b + " " + a);
    }
}
