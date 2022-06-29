package codeAcademy.zilvinas.nullExcercies.examples.example4;

class example4 {

    public static void main(String[] args) throws ArithmeticException {
        int i = 0;
        try {
            int z = 5 / i;
        }catch (ArithmeticException e){
            System.out.println("Division by zero ");
            throw e;
        }
    }
}
