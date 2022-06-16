package CodeAcademy.Zilvinas.Bankomatas3XD;

class Vartotojas {

    private int id;
    private int pin;
    private int saskaita;

    Vartotojas(){
    id = 0;
    pin = 0;
    saskaita = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaskaita() {
        return saskaita;
    }

    public void setSaskaita(int saskaita) {
        this.saskaita = saskaita;
    }


}
