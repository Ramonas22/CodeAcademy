package codeAcademy.exam.exam1.two;

abstract class Product {
    protected Integer protectedInt;
    abstract boolean canBeConsumed();

    Product(int protectedInt){
        this.protectedInt = protectedInt;
    }
}
