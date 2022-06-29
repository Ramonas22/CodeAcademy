package codeAcademy.zilvinas.nullExcercies.examples.example3;

class MultipleTrowExceptionExample {

    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }

    static void part1() {

        try {
            //Integer i = 10;
            //i = i/0;
            //i = null;
            //i = i/2;
        } catch (NullPointerException e) {
            System.out.println("there are no value assign");
        } catch (ArithmeticException e) {
            System.out.println("division by zero is impossible");
        } catch (Exception e) {
            System.out.println("unknown error");
        } finally {
            System.out.println("The end");
        }
    }

    static void part2() {
        try {
            int z = 5 / 0;
            String text = null;
            text.indexOf("A");
        } catch (NumberFormatException | NullPointerException | ArithmeticException e) {
            System.out.println("Error");
        }
    }

    static void part3() {
        try {
            try {
                // int i = 5 / 0;
                String text = null;
                text.indexOf("A");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}
