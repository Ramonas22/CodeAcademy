package CodeAcademy.Vytautas.interfaces.Task1;

class Hovercraft implements LandVehicle, SeaVessel {
    private Integer numWheels;
    private final Integer[] displacement = new Integer[2];
    private String name;
    private Integer maxPassengers;
    private Integer maxSpeed;

    void enterLand() {
        System.out.println("Entering land");
    }

    void enterSea() {
        System.out.println("Entering sea");
    }

    @Override
    public Integer getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Vroom vroom");
    }

    @Override
    public void setDisplacement(Integer x, Integer y) {
        this.displacement[0] = x;
        this.displacement[1] = y;
    }

    @Override
    public Integer[] getDisplacement() {
        return displacement;
    }

    @Override
    public void launch() {
        System.out.println("launches");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
