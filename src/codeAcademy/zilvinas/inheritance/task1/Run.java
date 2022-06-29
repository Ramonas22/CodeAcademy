package codeAcademy.zilvinas.inheritance.task1;

class Run {
    public static void main(String[] args) {
        PositiveNumber positiveNumber = new PositiveNumber();
        EvenNumber evenNumber = new EvenNumber();
        OddNumber oddNumber = new OddNumber();
        NegativeNumber negativeNumber = new NegativeNumber();

        System.out.println("\nPositive numbers ");
        run(positiveNumber);
        print(positiveNumber);
        System.out.println("-----------------------");

        System.out.println("\nEven numbers ");
        run(evenNumber);
        print(evenNumber);
        System.out.println("-----------------------");

        System.out.println("\nOdd numbers ");
        run(oddNumber);
        print(oddNumber);
        System.out.println("-----------------------");

        System.out.println("\nNegative numbers ");
        run(negativeNumber);
        print(negativeNumber);
        System.out.println("-----------------------");


    }
    static void print(Number object){
        for (int i: object.array
             ) {
            System.out.println(i);
        }
    }
    static void run(Number object){
        object.generate();
        System.out.println(object.sum());
    }
}
