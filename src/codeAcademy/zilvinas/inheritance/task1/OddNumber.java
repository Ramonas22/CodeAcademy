package codeAcademy.zilvinas.inheritance.task1;

import java.util.Random;

class OddNumber extends Number {
    @Override
    public void generate() {
        for (int i = 0, temp; i < array.length; i++) {
            do {
                temp = new Random().nextInt();
            } while (temp % 2 == 0);
            array[i] = temp;
        }
    }
}
