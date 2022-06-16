package CodeAcademy.Vytautas.Paveldejimas.classHierarchyFruitEdition;

class Mango extends ExoticFruit{
    Mango(String name, String color, String originCountry) {
        super(name, color, originCountry);
    }
    @Override
    void Iam(){
        System.out.println("I am mango and my name is " + getName() + " and my color is " + getColor()
         + " my origins are " + getOriginCountry());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit exotic fruit");
        super.IInherit();
    }
}
