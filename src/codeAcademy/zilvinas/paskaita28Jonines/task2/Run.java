package codeAcademy.zilvinas.paskaita28Jonines.task2;

import java.util.ArrayList;
import java.util.Arrays;

class Run {

    public static void main(String[] args) {
        Person person1 = new Person("Antanas", "Antanaitis");
        Person person2 = new Person("Tomas", "Cibulis");
        Person person3 = new Person("Petras", "Katinas");
        Person person4 = new Person("Austeja", "Burbaite");
        Person person5 = new Person("Aurelija", "Radvilaviciute");
        Person person6 = new Person("Lina", "Zuka");

        ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(person1, person2 , person3 , person4 , person5 , person6));

        for (Person person: personList
             ) {
            System.out.println(person.toString());
        }
    }
}
