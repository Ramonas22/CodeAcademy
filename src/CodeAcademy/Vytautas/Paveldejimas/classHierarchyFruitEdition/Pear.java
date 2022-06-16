package CodeAcademy.Vytautas.Paveldejimas.classHierarchyFruitEdition;

class Pear extends LithuanianFruit{
    Pear(String name, String color) {
        super(name, color);
    }
    @Override
    void Iam(){
        System.out.println("I am pear and my name is " + getName() + " and my color is " + getColor());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit lithuanian fruit");
        super.IInherit();
    }
}
