package codeAcademy.vytautas.paveldejimas.example;


class MotorineTransportoPriemone extends TransportoPriemone{

    private Double variklioTuris;

    MotorineTransportoPriemone(String pavadinimas, Integer pagaminimoMetai, Double variklioTuris){
        super(pavadinimas, pagaminimoMetai);

    }
    public Double getVariklioTuris() {
        return variklioTuris;
    }

    public void setVariklioTuris(Double variklioTuris) {
        this.variklioTuris = variklioTuris;
    }

    @Override
    void sound(){
        System.out.println("Vroom vroom");
    }
}
