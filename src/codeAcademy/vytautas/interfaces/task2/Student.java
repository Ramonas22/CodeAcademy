package codeAcademy.vytautas.interfaces.task2;

class Student implements Builder, Programmer{

    @Override
    public void constructingHouse(Integer integer) {
        System.out.println("Nama statu letai " + (integer*2));
    }

    @Override
    public void programming() {
        System.out.println("As dar mokausi programuoti");
    }
}
