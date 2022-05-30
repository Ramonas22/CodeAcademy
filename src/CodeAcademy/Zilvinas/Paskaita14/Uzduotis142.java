package CodeAcademy.Zilvinas.Paskaita14;

public class Uzduotis142 {

    static int i = 1;
    void didinti(){i++;}
    int nuskaitytiI(){return i;}
    public static void main(String[] args){

        Uzduotis142 e1 = new Uzduotis142(), e2 = new Uzduotis142();

        e1.didinti(); e2.didinti();

        System.out.println(e1.nuskaitytiI());
    }
}
