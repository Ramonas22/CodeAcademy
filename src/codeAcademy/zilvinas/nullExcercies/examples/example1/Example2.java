package codeAcademy.zilvinas.nullExcercies.examples.example1;

class Example2 {
    public static void main(String[] args) throws ArithmeticException{
        A a = null;

        if(a != null){
            a.methodA();
        }

        a = new A();

        if(a != null){
            a.methodA();
        }

    }
}
