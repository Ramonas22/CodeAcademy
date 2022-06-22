package codeAcademy.zilvinas.arrayListAndLinkedList.task4;

import java.util.LinkedList;

class Task4 {
    public static void main(String[] args) {
        task4();
    }

    private static void task4(){
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.push("Ramonas");
        stringLinkedList.push("is");
        stringLinkedList.push("name");
        stringLinkedList.push("My");

        System.out.println(stringLinkedList);

        System.out.println("First element of the list is " + stringLinkedList.getFirst() + "\nlast element of the list " + stringLinkedList.getLast());

        String first = stringLinkedList.pollFirst();
        String last = stringLinkedList.pollLast();

        System.out.println("First " + first + "\nLast " + last +"\n" + stringLinkedList);

        stringLinkedList.push("hey");

        System.out.println(stringLinkedList);

        stringLinkedList.pop();

        System.out.println(stringLinkedList);



    }
}
