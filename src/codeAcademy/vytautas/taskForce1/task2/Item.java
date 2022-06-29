package codeAcademy.vytautas.taskForce1.task2;

class Item {
    private String name;
    private Double price;


    public Item() {
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    void itemInfo(){
        System.out.printf("\nItem name %s ,it has price: %.2f",getName() , getPrice());
    }

    Double sellItem(){
        System.out.println("Item sold:");
        itemInfo();
        return getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
