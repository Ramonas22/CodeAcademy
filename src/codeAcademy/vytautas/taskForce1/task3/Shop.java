package codeAcademy.vytautas.taskForce1.task3;

import java.util.ArrayList;

enum TradeNetwork{
    MAXIMA,
    IKI,
    RIMI,
    LIDL

}
class Shop implements Cooling {
    private String address;
    private Integer employeesCount;
    private TradeNetwork tradeNetwork;
    private ArrayList<Item> itemArrayList = new ArrayList<>();


    void print(){
        System.out.println("Address : " + getAddress() + " , employee count : " + getEmployeesCount() + " Trade network " + getTradeNetwork());
    }

    public Shop() {
    }

    public Shop(String address, Integer employeesCount, TradeNetwork tradeNetwork) {
        this.address = address;
        this.employeesCount = employeesCount;
        this.tradeNetwork = tradeNetwork;
    }

    public Shop(String address, Integer employeesCount, TradeNetwork tradeNetwork, ArrayList<Item> itemArrayList) {
        this.address = address;
        this.employeesCount = employeesCount;
        this.tradeNetwork = tradeNetwork;
        this.itemArrayList = itemArrayList;
    }

    public void cheapestItemInTheShop(){
        if(itemArrayList.size()>0){
            System.out.println("Cheapest Item in");
            print();
            int cheap = 0;
            for (int i = 0; i < itemArrayList.size(); i++) {
                if(itemArrayList.get(cheap).getPrice() < itemArrayList.get(i).getPrice()){
                    cheap = i;
                }
            }
            itemArrayList.get(cheap).itemInfo();
        }
    }

    public void sellAllShopItems() throws InvalidShopItemPrice{
        if(itemArrayList.size() > 0){
            System.out.println("\nItems sold at " + getTradeNetwork());
            for (Item item: itemArrayList
             ) {
                item.sellItem();
            }
        }else {
            System.out.println("There are no items in the shop atm :(");
        }

    }

    @Override
    public void turnOnCooling() {
        switch (tradeNetwork){
            case MAXIMA -> System.out.println("Temperature 20 degrees");
            case IKI -> System.out.println("Temperature 19 degrees");
            case RIMI -> System.out.println("Temperature 18 degrees");
            case LIDL -> System.out.println("Temperature 17 degrees");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }

    public TradeNetwork getTradeNetwork() {
        return tradeNetwork;
    }

    public void setTradeNetwork(TradeNetwork tradeNetwork) {
        this.tradeNetwork = tradeNetwork;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }
}
