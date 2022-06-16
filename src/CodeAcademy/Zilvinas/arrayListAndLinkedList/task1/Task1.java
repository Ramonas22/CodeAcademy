package CodeAcademy.Zilvinas.arrayListAndLinkedList.task1;

import java.util.ArrayList;

class Task1 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(4);
        integers.add(6);

        System.out.println("Initial list of integers " + integers);

        integers.remove(1);

        System.out.println("List after removing index 1 from it " + integers);
    }
}
