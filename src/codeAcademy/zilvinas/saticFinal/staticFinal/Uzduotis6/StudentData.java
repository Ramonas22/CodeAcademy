package codeAcademy.zilvinas.saticFinal.staticFinal.Uzduotis6;

class StudentData {
    private final int studentoID;
    private String vardas;
    private final int metai;

    public StudentData(int studentoID,String vardas, int metai){
        this.studentoID = studentoID;
        this.vardas = vardas;
        this.metai = metai;
    }

    public void spausdink(){
        System.out.println("Studento ID " + getStudentoID() + " vardas " + getVardas() + " metai " + getMetai());
    }

    public void setVardas(String vardas){
        this.vardas = vardas;
    }


    public int getStudentoID() {
        return studentoID;
    }

    public String getVardas(){
        return vardas;
    }
    public int getMetai() {
        return metai;
    }
}
