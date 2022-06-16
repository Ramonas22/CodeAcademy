package CodeAcademy.Vytautas.Paveldejimas.classHierarchyFruitEdition;

class LithuanianFruit extends Fruit{
    LithuanianFruit(String name, String color) {
        super(name, color);
    }
    @Override
    void Iam(){
        System.out.println("I am lithuanian fruit and my name is " + getName() + " and my color is " + getColor());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit fruit");
    }
}
