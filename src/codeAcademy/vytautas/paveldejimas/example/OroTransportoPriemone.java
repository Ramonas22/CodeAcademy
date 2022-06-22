package codeAcademy.vytautas.paveldejimas.example;

class OroTransportoPriemone extends MotorineTransportoPriemone{
    private Integer varikliuSkaicius;
    OroTransportoPriemone(String pavadinimas, Integer pagaminimoMetai,Double variklioTuris, Integer varikliuSkaicius ) {
        super(pavadinimas, pagaminimoMetai,variklioTuris);
        this.varikliuSkaicius = varikliuSkaicius;
    }

    public Integer getVarikliuSkaicius() {
        return varikliuSkaicius;
    }

    public void setVarikliuSkaicius(Integer varikliuSkaicius) {
        this.varikliuSkaicius = varikliuSkaicius;
    }
    @Override
    void sound(){
        System.out.println("Zvimmmm");
    }
}
