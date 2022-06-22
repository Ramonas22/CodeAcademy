package codeAcademy.vytautas.paveldejimas.classHierarchyFruitEdition;

class Pineapple extends ExoticFruit {
    Pineapple(String name, String color, String originCountry) {
        super(name, color, originCountry);
    }

    @Override
    void Iam() {
        System.out.println("I am pineapple and my name is " + getName() + " and my color is " + getColor()
                + " my origins are " + getOriginCountry());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit exotic fruit");
        super.IInherit();
    }
}
