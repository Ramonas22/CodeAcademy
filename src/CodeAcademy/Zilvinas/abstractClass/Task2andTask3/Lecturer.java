package CodeAcademy.Zilvinas.abstractClass.Task2andTask3;

class Lecturer extends Person{
    Lecturer(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
    }

    @Override
    void printInfo() {
        System.out.println("Lecturer name " + getName() + " surname " + getSurname());
    }
}
