package CodeAcademy.Zilvinas.Paskaita14.StaticFinal.Uzduotis5;

public class Uzduotis5 {

    static final float PI = 3.14f;

    public static void main(String[] args) {
        System.out.println("Apskritimo perimetras kai spindulys = 12 : " + perimetras(12));
        System.out.println("Apskritimo perimetras kai spindulys = 5 : " + perimetras(5));
    }

    static float perimetras(float spindulys){
        return spindulys*2*PI;
    }
}
