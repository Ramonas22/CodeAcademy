package codeAcademy.vytautas.paveldejimas.classHierarchyFruitEdition;

class Apple extends LithuanianFruit{
    Apple(String name, String color){
        super(name, color);
    }
    @Override
    void Iam(){
        System.out.println("I am apple and my name is " + getName() + " and my color is " + getColor());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit lithuanian fruit");
        super.IInherit();

    }
}
