package codeAcademy.zilvinas.inheritance.task1;

import java.util.Random;

class NegativeNumber extends Number{
    @Override
    public void generate() {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs( new Random().nextInt()) * -1;
        }
    }
}
