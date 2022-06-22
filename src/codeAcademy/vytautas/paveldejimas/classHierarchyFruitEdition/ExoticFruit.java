package codeAcademy.vytautas.paveldejimas.classHierarchyFruitEdition;

class ExoticFruit extends Fruit{

    private String originCountry;
    ExoticFruit(String name, String color, String originCountry) {
        super(name, color);
        this.originCountry = originCountry;
    }
    @Override
    void Iam(){
        System.out.println("I am exotic fruit and my name is " + getName() + " and my color is " + getColor()
        +" my origins are " + getOriginCountry());
    }
    @Override
    void IInherit(){
        System.out.println("I inherit fruit");
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
