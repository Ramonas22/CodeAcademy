package CodeAcademy.Vytautas.paskaita20.uzduotis1;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        Driver experiencedDriver = new Driver("Johny" , "KDN 124", 8);
        Driver newbie = new Driver("Tommy" , "ABT 254", 2);

        ArrayList<Driver> driverPark = new ArrayList<>();

        driverPark.add(experiencedDriver);
        driverPark.add(newbie);

        Driver.mostExperiencedDriver(driverPark);
    }
}
