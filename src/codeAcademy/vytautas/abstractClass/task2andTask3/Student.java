package codeAcademy.vytautas.abstractClass.task2andTask3;

class Student extends Person{

    Student(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
    }

    @Override
    void printInfo() {
        System.out.println("Student name " + getName() + " surname " + getSurname());
    }
}
