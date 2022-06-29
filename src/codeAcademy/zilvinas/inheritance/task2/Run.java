package codeAcademy.zilvinas.inheritance.task2;

class Run {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //Composition
        a.getX().method();

        //Inheritance
        b.method();
    }
}
