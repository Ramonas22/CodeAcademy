package codeAcademy.zilvinas.arrayListAndLinkedList.task3;

import java.util.ArrayList;

class Task3 {
    public static void main(String[] args) {
        ArrayList<Coordinates> coordinatesArrayList = new ArrayList<>();

        coordinatesArrayList.add(new Coordinates(1, 5));
        coordinatesArrayList.add(new Coordinates(5, 9));
        coordinatesArrayList.add(new Coordinates(4, 0));
        coordinatesArrayList.add(new Coordinates(0, 0));
        coordinatesArrayList.add(new Coordinates(9, 1));

        printInfo(coordinatesArrayList);

        findCoordinate(coordinatesArrayList, 0, 0);

        printInfo(coordinatesArrayList);
    }

    static void printInfo(ArrayList<Coordinates> coordinatesArrayList) {
        for (Coordinates coordinates : coordinatesArrayList
        ) {
            System.out.printf("(%d:%d)", coordinates.getX(), coordinates.getY());
        }
    }

    static void findCoordinate(ArrayList<Coordinates> coordinatesArrayList, Integer x, Integer y) {
        int counter = 0;
        for (Coordinates coordinates : coordinatesArrayList
        ) {
            if (coordinates.getX() == x && coordinates.getY() == y) {
                break;
            } else {
                counter++;
            }
        }

        if (counter >= coordinatesArrayList.size()) {
            System.out.println("\n\nCannot change " + x + ":" + y + " coordinate to 1:1 since it is not inside list\n");
        } else {
            //Show coordinate index
            System.out.println("\n\nCoordinate " + x + ":" + y + " index in list is " + counter + "\n");

            //Swap chosen coordinate to 1 1
            coordinatesArrayList.get(counter).setX(1);
            coordinatesArrayList.get(counter).setY(1);
            System.out.println("Coordinate " + x + ":" + y + " swapped to 1:1\n");
        }
    }


}

