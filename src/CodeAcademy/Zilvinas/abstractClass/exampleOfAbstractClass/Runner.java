package CodeAcademy.Zilvinas.abstractClass.exampleOfAbstractClass;

class Runner {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bee bee = new Bee();

        dog.MakingSound();
        cat.MakingSound();
        bee.MakingSound();
    }
}
