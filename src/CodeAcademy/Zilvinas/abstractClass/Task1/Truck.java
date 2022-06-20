package CodeAcademy.Zilvinas.abstractClass.Task1;

class Truck extends Vehicle{
    private Integer maximumPayload;

    @Override
    void drive() {
        System.out.println("Truck goes brum brum");
    }

    public Integer getMaximumPayload() {
        return maximumPayload;
    }

    public void setMaximumPayload(Integer maximumPayload) {
        this.maximumPayload = maximumPayload;
    }
}
