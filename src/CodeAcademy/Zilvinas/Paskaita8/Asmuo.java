package CodeAcademy.Zilvinas.Paskaita8;

import java.util.Scanner;

class Asmuo {
    private String vardas;
    private String pavarde;

    private String vardasPavarde() {
        return getVardas() + getPavarde();
    }

    public void spausdinkVardaSuPavarde() {
        System.out.println(vardasPavarde());
    }

    public void asmuoKlausia() {
        Scanner fox = new Scanner(System.in);
        System.out.println(vardasPavarde() + "What does the fox say ?");
        System.out.println("silent echo - " + fox.nextLine());
    }

    public void asmuoSako(String tekstas) {
        vardasPavarde();
        System.out.println("- " + tekstas);
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }



}
