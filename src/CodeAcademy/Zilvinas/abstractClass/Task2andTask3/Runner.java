package CodeAcademy.Zilvinas.abstractClass.Task2andTask3;

import java.util.Collections;
import java.util.HashSet;

class Runner {

    public static void main(String[] args) {
        Person student = new Student("Tom", "Wily");
        Person lecturer = new Lecturer("Riddle", "Mingle");

        student.printInfo();
        lecturer.printInfo();


        Person[] people = new Person[2];
        Person[] people2 = new Person[2];

        people[0] = student;
        people[1] = student;

        people2[0] = student;
        people2[1] = lecturer;


        System.out.println(Check(people));
        System.out.println(Check(people2));


    }

    //Task3
    static Boolean Check(Person[] personsArrays) {

        HashSet<Person> peopleSet = new HashSet<>();
        Collections.addAll(peopleSet, personsArrays);

        return peopleSet.size() == personsArrays.length;
    }
}
