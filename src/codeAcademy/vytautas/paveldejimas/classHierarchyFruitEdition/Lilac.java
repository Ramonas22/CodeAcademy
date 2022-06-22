package codeAcademy.vytautas.paveldejimas.classHierarchyFruitEdition;

class Lilac extends Apple{
    Lilac(String name, String color){
        super(name, color);
    }
    @Override
    void Iam(){
        System.out.println("I am lilac and my name is " + getName() + " and my color is " + getColor());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit apple");
        super.IInherit();
    }
}
