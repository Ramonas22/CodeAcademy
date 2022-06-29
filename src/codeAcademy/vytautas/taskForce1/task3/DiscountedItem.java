package codeAcademy.vytautas.taskForce1.task3;

class DiscountedItem extends Item {
    private Integer discountPercentage;

    public DiscountedItem() {
    }

    public DiscountedItem(String name, Double price, Integer discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    void itemInfo(){
        System.out.printf("Item name %s ,it has price: %.2f , discount percentage %s\n",getName() , getPrice(), getDiscountPercentage());
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
