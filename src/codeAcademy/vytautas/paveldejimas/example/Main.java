package codeAcademy.vytautas.paveldejimas.example;

class Main {
    public static void main(String[] args) {
        TransportoPriemone priemone = new TransportoPriemone("Laivas" , 1998);
        MotorineTransportoPriemone priemone1 = new MotorineTransportoPriemone("Keturatis" , 2002 , 1.0);
        OroTransportoPriemone lektuvas = new OroTransportoPriemone("Lektuvas", 2006 , 1000.0, 8);

        priemone.sound();
        priemone1.sound();
        lektuvas.sound();

    }
}
