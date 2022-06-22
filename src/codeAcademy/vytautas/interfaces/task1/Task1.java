package codeAcademy.vytautas.interfaces.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Jeep car1 = new Jeep();
        Jeep car2 = new Jeep();
        Hovercraft hovercraft1 = new Hovercraft();
        Hovercraft hovercraft2 = new Hovercraft();
        Frigate frigate1 = new Frigate();
        Frigate frigate2 = new Frigate();
        PoliceCar policeCar = new PoliceCar();

        List<Object> list = new ArrayList<>();

        list.add(car1);
        list.add(car2);
        list.add(hovercraft1);
        list.add(hovercraft2);
        list.add(frigate1);
        list.add(frigate2);
        list.add(policeCar);

        whatTypeItIs(list);

        runCommands(list);

    }

    static void whatTypeItIs(List<Object> listOfVehicle) {

        for (int i = 0; i < listOfVehicle.size(); i++) {
            if (listOfVehicle.get(i) instanceof Vehicle) {
                System.out.println("List " + i + " is vehicle");
            }
            if (listOfVehicle.get(i) instanceof LandVehicle) {
                System.out.println("List " + i + " vehicle is Land vehicle");
            }
            if (listOfVehicle.get(i) instanceof SeaVessel) {
                System.out.println("List " + i + " vehicle is Sea vessel");
            }
            if (listOfVehicle.get(i) instanceof Hovercraft) {
                System.out.println("List " + i + " vehicle is Hovercraft");
            }
            if (listOfVehicle.get(i) instanceof Jeep) {
                System.out.println("List " + i + " vehicle is Jeep");
            }
            if (listOfVehicle.get(i) instanceof Frigate) {
                System.out.println("List " + i + " vehicle is Frigate");
            }
            if (listOfVehicle.get(i) instanceof PoliceCar) {
                System.out.println("List " + i + " vehicle is police car");
            }
            System.out.println("\n");
        }
    }

    private static void fillListItems(List<Object> listOfVehicle) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listOfVehicle.size(); i++) {
            if (listOfVehicle.get(i) instanceof LandVehicle) {
                System.out.println("How many wheels land vehicle " + i + " will have");
                ((LandVehicle) listOfVehicle.get(i)).setNumWheels(scanner.nextInt());
            }
            if (listOfVehicle.get(i) instanceof SeaVessel) {
                int x, y;
                System.out.println("Set displacement of " + i + " sea vessel" +
                        "\nEnter x coordinate ");
                x = scanner.nextInt();
                System.out.println("Enter y coordinate");
                y = scanner.nextInt();
                ((SeaVessel) listOfVehicle.get(i)).setDisplacement(x, y);
            }
            if (listOfVehicle.get(i) instanceof Vehicle) {
                System.out.println("Set vehicle " + i + " name for it");
                ((Vehicle) listOfVehicle.get(i)).setName(scanner.next());

                System.out.println("Set how many vehicle " + i + " passengers will fit in it");
                ((Vehicle) listOfVehicle.get(i)).setMaxPassengers(scanner.nextInt());

                System.out.println("Set vehicle " + i + " max speed for it");
                ((Vehicle) listOfVehicle.get(i)).setMaxSpeed(scanner.nextInt());

            }
        }
        System.out.println("\n");
    }

    private static void runCommandsOfList(List<Object> objectList) {
        for (int i = 0; i < objectList.size(); i++) {

            if (objectList.get(i) instanceof Vehicle) {
                System.out.println("List " + i + " is vehicle");
                System.out.println("Vehicle name " + ((Vehicle) objectList.get(i)).getName()
                        + "\nvehicle can carry " + (((Vehicle) objectList.get(i)).getMaxPassengers()) + " passengers"
                        + "\nvehicle max speed is " + ((Vehicle) objectList.get(i)).getMaxSpeed());
            }
            if (objectList.get(i) instanceof LandVehicle) {
                System.out.println("List " + i + " vehicle is Land vehicle goes");
                ((LandVehicle) objectList.get(i)).drive();
                System.out.println("with his " + ((LandVehicle) objectList.get(i)).getNumWheels() + " wheels");
            }
            if (objectList.get(i) instanceof SeaVessel) {
                System.out.println("List " + i + " vehicle is Sea vessel");
                ((SeaVessel) objectList.get(i)).launch();
                System.out.println("from coordinates " + (((SeaVessel) objectList.get(i)).getDisplacement())[0]
                        + " : " +(((SeaVessel) objectList.get(i)).getDisplacement())[1]);
            }
            if (objectList.get(i) instanceof Hovercraft) {
                System.out.println("List " + i + " vehicle is Hovercraft");
                ((Hovercraft) objectList.get(i)).enterLand();
                ((Hovercraft) objectList.get(i)).enterSea();
            }
            if (objectList.get(i) instanceof Jeep) {
                System.out.println("List " + i + " vehicle is Jeep");
                ((Jeep) objectList.get(i)).drive();
            }
            if (objectList.get(i) instanceof Frigate) {
                System.out.println("List " + i + " vehicle is Frigate");
                ((Frigate) objectList.get(i)).fireGun();
            }
            if (objectList.get(i) instanceof PoliceCar) {
                System.out.println("List " + i + " vehicle is police car");
                ((PoliceCar) objectList.get(i)).drive();
                ((PoliceCar) objectList.get(i)).soundSiren();
            }
            System.out.println("\n");
        }
    }

    static void runCommands(List<Object> objects){
        fillListItems(objects);
        runCommandsOfList(objects);
    }
}
