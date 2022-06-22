package codeAcademy.vytautas.interfaces.task2;

class Professional implements Builder, Programmer{

    @Override
    public void constructingHouse(Integer integer) {
        System.out.println("Greitai statau nama, pastatau per " + (integer/2));
    }

    @Override
    public void programming() {
        System.out.println("Programuoju jau 7 metus");
    }
}
