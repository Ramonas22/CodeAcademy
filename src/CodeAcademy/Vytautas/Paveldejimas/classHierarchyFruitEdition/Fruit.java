package CodeAcademy.Vytautas.Paveldejimas.classHierarchyFruitEdition;

class Fruit {
    private String name;
    private String color;

    Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }
    void Iam(){
        System.out.println("I am fruit and my name is " + getName() + " and my color is " + getColor());
    }
    void IInherit(){
        System.out.println("I am fruit and do not inherit anything :D");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
