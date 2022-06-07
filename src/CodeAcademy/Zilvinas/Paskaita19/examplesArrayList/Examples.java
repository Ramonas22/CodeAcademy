package CodeAcademy.Zilvinas.Paskaita19.examplesArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Examples {

    /*We CANNOT add primitive types to lists
    * IF we want to add them we have to convert them to objects
    * Integer intObject = new Integer(5);
    * Float floatObject = new Float(6.4f);
    * Double doubleObject = new Double(24.5);
    * Boolean booleanObject = new Boolean(true);
    * */

    public static void main(String[] args) {
        primitiveElementsInList();
    }


    static void loopingExamples() {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Vilnius");
        cities.add("Kaunas");
        cities.add("Klaipeda");
        cities.add("Siauliai");

        //Simple for cycle
        System.out.println("\n using for cycle");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        //for cycle for arrays and lists
        System.out.println("\n using enchanted for cycle");
        for (String tempString : cities
        ) {
            System.out.println(tempString);
        }

        //while cycle
        System.out.println("\n using while cycle");
        int count = 0;
        while (cities.size() < count) {
            System.out.println(cities.get(count));
            count++;
        }

        //while + iterator
        System.out.println("\n using while cycle with iterator");
        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    static void sortingExample(){
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Vilnius");
        cities.add("Kaunas");
        cities.add("Klaipeda");
        cities.add("Siauliai");

        System.out.println(cities);

        Collections.sort(cities);

        System.out.println(cities);

        Collections.sort(cities, Collections.reverseOrder());

        System.out.println(cities);
    }

    static void combiningListsExample(){
        ArrayList<String> cities1 = new ArrayList<>();
        ArrayList<String> cities2 = new ArrayList<>();

        cities1.add("Vilnius");
        cities1.add("Kaunas");

        cities2.add("Klaipeda");
        cities2.add("Siauliai");

        System.out.println("First list of cities " + cities1);
        System.out.println("\nSecond list of cities " + cities2);

        cities1.addAll(cities2);

        System.out.println("\nSecond list added to first list " + cities1);
    }

    static void swappingElementsInList(){
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Vilnius");
        cities.add("Kaunas");
        cities.add("Klaipeda");
        cities.add("Siauliai");

        System.out.println("Original cities list " + cities);
        Collections.swap(cities, 0 , 1);
        System.out.println("\nList of cities after swap of 0 and 1 elements " + cities);
    }

    static void primitiveElementsInList(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(6);

        System.out.println(integerArrayList);

        Integer intObject = integerArrayList.get(1);

        int primitiveVariable = intObject.intValue();

        System.out.println(primitiveVariable);

    }

}
