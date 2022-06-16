package CodeAcademy.Zilvinas.arrayListAndLinkedList.task3;

import java.util.ArrayList;

class Task3 {
    public static void main(String[] args) {
        ArrayList<Coordinates> coordinatesArrayList = new ArrayList<>();

        coordinatesArrayList.add(new Coordinates(1, 5));
        coordinatesArrayList.add(new Coordinates(5, 9));
        coordinatesArrayList.add(new Coordinates(4, 0));
        coordinatesArrayList.add(new Coordinates(0, 0));
        coordinatesArrayList.add(new Coordinates(9, 1));

        for (Coordinates cordinates : coordinatesArrayList
        ) {
            System.out.printf("(%d:%d)", cordinates.getX(), cordinates.getY());
        }

        int counter = 0;
        for (Coordinates cordinates : coordinatesArrayList
        ) {
            if (cordinates.getX() == 0 && cordinates.getY() == 0) {
                break;
            } else {
                counter++;
            }
        }
        if(counter>=coordinatesArrayList.size()){
            System.out.println("\n\nCannot change 0:0 coordinate to 1:1 since it is not inside list\n");
        }else {
            System.out.println("\n\nCoodinate 0:0 index in list is " + counter + "\n");
            coordinatesArrayList.get(counter).setX(1);
            coordinatesArrayList.get(counter).setY(1);
            System.out.println("Coordinate 0:0 swapted to 1:1\n");
        }
        for (Coordinates cordinates : coordinatesArrayList
        ) {
            System.out.printf("(%d:%d)", cordinates.getX(), cordinates.getY());
        }
    }
}

