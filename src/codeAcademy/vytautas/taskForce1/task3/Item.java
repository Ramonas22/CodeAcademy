package codeAcademy.vytautas.taskForce1.task3;

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
        System.out.printf("Item name %s ,it has price: %.2f\n",getName() , getPrice());
    }

    Double sellItem() throws InvalidShopItemPrice{
        try {
            if(getPrice()<0){
                throw new InvalidShopItemPrice("Invalid item price" , getPrice());
            }else {
                System.out.println("Item sold:");
                itemInfo();
                return getPrice();
            }
        }catch (InvalidShopItemPrice e){
            System.out.println(e.getMessage() + " " + e.getPrice());
            return null;
        }
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
