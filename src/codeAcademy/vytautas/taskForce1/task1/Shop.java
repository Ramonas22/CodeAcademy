package codeAcademy.vytautas.taskForce1.task1;

enum TradeNetwork{
    MAXIMA,
    IKI,
    RIMI,
    LIDL

}
class Shop implements Cooling{
    private String address;
    private Integer employeesCount;
    private TradeNetwork tradeNetwork;


    void print(){
        System.out.println("Address : " + address + " , employee count : " + employeesCount + " Trade network " + tradeNetwork);
    }

    public Shop() {
    }

    public Shop(String address, Integer employeesCount, TradeNetwork tradeNetwork) {
        this.address = address;
        this.employeesCount = employeesCount;
        this.tradeNetwork = tradeNetwork;
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

    @Override
    public void turnOnCooling() {
        switch (tradeNetwork){
            case MAXIMA -> System.out.println("Temperature 20 degrees");
            case IKI -> System.out.println("Temperature 19 degrees");
            case RIMI -> System.out.println("Temperature 18 degrees");
            case LIDL -> System.out.println("Temperature 17 degrees");
        }
    }
}
