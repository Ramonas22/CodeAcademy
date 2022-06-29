package codeAcademy.zilvinas.paskaita28Jonines.task2andTask3;

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

        System.out.println();

        System.out.println(Check(people));
        System.out.println(Check(people2));

        System.out.println();

        System.out.println(CheckWithOverload(people));
        System.out.println(CheckWithOverload(people2));


    }

    //Task3
    static Boolean Check(Person[] personsArrays) {

        HashSet<Person> peopleSet = new HashSet<>();
        Collections.addAll(peopleSet, personsArrays);

        return peopleSet.size() == personsArrays.length;
    }
    //Task3
    static Boolean CheckWithOverload(Person[] people){
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 1+i; j < people.length; j++) {
                if(people[j-1].equals(people[j])){
                    return false;
                }
            }
        }
        return true;
    }
}
