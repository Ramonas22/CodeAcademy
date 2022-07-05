package codeAcademy.exam.exam1.one;

class Asmuo {
    private static Integer sukurtuAsmenuSkaicius = 0;
    private String Vardas;
    private String Pavarde;
    private Integer gimimoMetai;

    public Asmuo() {
        setSukurtuAsmenuSkaicius(getSukurtuAsmenuSkaicius() + 1);
        System.out.println("Sukurtas nauajs asmuo be priskirtu reiksmiu");
    }

    public Asmuo(String vardas, String pavarde, Integer gimimoMetai) {
        Vardas = vardas;
        Pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
        setSukurtuAsmenuSkaicius(getSukurtuAsmenuSkaicius() + 1);
        System.out.println("Sukurtas nauajs asmuo su nustatytom reiksmem");
    }

    //Spausdina kiek asmenu buvo sukurta iki siol
    static void kiekSukurtuAsmenu() {
        if(getSukurtuAsmenuSkaicius() == 0){
        System.out.printf("Iki siol yra sukurta %d, asmenu\n", getSukurtuAsmenuSkaicius());
        }else {
            System.out.printf("Iki siol yra sukurta %d, asmenys\n", getSukurtuAsmenuSkaicius());
        }
    }

    //Pakeicia pavarde
    void pakeistiPavarde(String pavarde) {
        setPavarde(pavarde);
    }

    //Spausdina info
    void spausdintiInfo() {
        System.out.printf("Asmens vardas %s, pavarde %s, gimimo metai %d\n", getVardas(), getPavarde(), getGimimoMetai());
    }

    //Setteriai Getteriai
    public static Integer getSukurtuAsmenuSkaicius() {
        return sukurtuAsmenuSkaicius;
    }

    public static void setSukurtuAsmenuSkaicius(Integer sukurtuAsmenuSkaicius) {
        Asmuo.sukurtuAsmenuSkaicius = sukurtuAsmenuSkaicius;
    }


    public String getVardas() {
        return Vardas;
    }

    public void setVardas(String vardas) {
        Vardas = vardas;
    }

    public String getPavarde() {
        return Pavarde;
    }

    public void setPavarde(String pavarde) {
        Pavarde = pavarde;
    }

    public Integer getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(Integer gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }
}
