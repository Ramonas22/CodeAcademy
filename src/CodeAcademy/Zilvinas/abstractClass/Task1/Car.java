package CodeAcademy.Zilvinas.abstractClass.Task1;

class Car extends Vehicle{
    private Integer trunkCapacity;

    @Override
    void drive() {
        System.out.println("Car goes sututututu");
    }

    public Integer getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(Integer trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
