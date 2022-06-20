package CodeAcademy.Zilvinas.abstractClass.Task2andTask3;

abstract class Person {
    private String name;
    private String surname;

    abstract void printInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
