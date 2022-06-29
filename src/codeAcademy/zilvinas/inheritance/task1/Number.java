package codeAcademy.zilvinas.inheritance.task1;

abstract class Number {
    protected int[] array = new int[(int) (Math.random() * (200 - 20 + 1)) +20];

    public abstract void generate();

    public int sum(){
        int sum = 0;
        for (int a : array
             ) {
            sum+= a;
        }
        return sum;
    }

}
