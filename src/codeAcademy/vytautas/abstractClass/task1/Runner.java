package codeAcademy.vytautas.abstractClass.task1;

import java.time.LocalDate;

class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        car.setColor("Red");
        truck.setColor("Black");
        car.setRegistrationDate(LocalDate.now().minusYears(40));
        truck.setRegistrationDate(LocalDate.now().minusYears(50));
        car.setTrunkCapacity(20);
        truck.setMaximumPayload(500);

        System.out.println("Car was made " + car.getRegistrationDate() + " and its color is " + car.getColor());
        car.drive();

        System.out.println("Truck was made " + truck.getRegistrationDate() + " and its color is " + truck.getColor());
        truck.drive();

    }
}
