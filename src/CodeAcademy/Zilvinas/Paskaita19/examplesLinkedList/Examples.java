package CodeAcademy.Zilvinas.Paskaita19.examplesLinkedList;

import java.util.LinkedList;

class Examples {

    public static void main(String[] args) {
        pushAndPopExample();
    }

    static void linkedListExample(){
        //Creaete new Linked list
        LinkedList<String> linkedList = new LinkedList<>();

        //Add elements to list
        linkedList.add("vasaris");
        linkedList.add("kovas");
        linkedList.add("balandis");
        linkedList.add("geguze");

        System.out.println(linkedList);

        //Add Elements to start and end of the list
        linkedList.addFirst("SAUSIS");
        linkedList.addLast("BIRZELIS");

        System.out.println(linkedList);

        //Remove first and last element of list
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

        //Add and delete element from list by index
        linkedList.add(0, "Dar vienas menuo");
        linkedList.remove(2);

        System.out.println(linkedList);


        //Return first element of the list and remove it
        String menuo = linkedList.poll();
        System.out.println(menuo);
        System.out.println(linkedList);

        //Return first element of the list and remove it
        menuo = linkedList.pollFirst();
        System.out.println(menuo);
        System.out.println(linkedList);

        //Return last element of the list and remove it
        menuo = linkedList.pollLast();
        System.out.println(menuo);
        System.out.println(linkedList);

    }

    static void pushAndPopExample(){
        //Creaete new Linked list
        LinkedList<String> linkedList = new LinkedList<>();

        //Add elements to list
        linkedList.add("vasaris");
        linkedList.add("kovas");
        linkedList.add("balandis");
        linkedList.add("geguze");

        System.out.println(linkedList);

        //Push sausis to list
        linkedList.push("sausis");

        System.out.println(linkedList);

        //Pop element from the list

        String poppedElement = linkedList.pop();

        System.out.println(poppedElement);
        System.out.println(linkedList);
    }
}
