package CodeAcademy.Vytautas.Paveldejimas.classHierarchyFruitEdition;

class Antaninis extends Apple{
    Antaninis(String name, String color){
        super(name, color);
    }
    @Override
    void Iam(){
        System.out.println("I am antaninis and my name is " + getName() + " and my color is " + getColor());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit apple");
        super.IInherit();
    }
}
