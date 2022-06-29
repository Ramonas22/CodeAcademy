package codeAcademy.vytautas.taskForce1.task3;

class InvalidShopItemPrice extends Exception{
    private Double price;

    public InvalidShopItemPrice(String message, Double price) {
        super(message);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
