package codeAcademy.vytautas.interfaces.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Car old = new Car("Ford", 1996);
        Car mid = new Car("Peugeot", 1998);
        Car antique = new Car("Chevrolet", 1924);
        Car quiteNew = new Car("Tesla", 2022);
        Car drivable = new Car("Audi", 2014);

        List<Car> list = new ArrayList<>(Arrays.asList(old, mid, antique, quiteNew, drivable));

        print(list);

        Collections.sort(list);

        System.out.println("\nSorted\n");
        print(list);
    }

    static void print(List<Car> carList){
        for (Car car : carList) {
            System.out.println("Mark " + car.getMark() + " year or manufacture " + car.getYearOfManufacture());
        }
    }
}
