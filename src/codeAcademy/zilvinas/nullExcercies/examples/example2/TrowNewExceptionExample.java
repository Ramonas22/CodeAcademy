package codeAcademy.zilvinas.nullExcercies.examples.example2;

class TrowNewExceptionExample {

    public static void main(String[] args) throws Exception {

     //   throw new Exception("Very big mistake");


       try {
            int i = 5/0;
        }catch (ArithmeticException e){
            System.out.println("Division by zero");
        }finally {
            System.out.println("The end");
        }
    }
}
