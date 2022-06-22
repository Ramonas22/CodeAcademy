package codeAcademy.vytautas.paveldejimas.example;

class TransportoPriemone {
    private String pavadinimas;
    private Integer pagaminimoMetai;

    TransportoPriemone(String pavadinimas, Integer pagaminimoMetai){
        this.pavadinimas = pavadinimas;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(Integer pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    void sound(){
        System.out.println("Sheess");
    }
}
