package codeAcademy.vytautas.interfaces.task1;

class PoliceCar implements IsEmergency, LandVehicle{
    private Integer numWheels;
    private String name;
    private Integer maxPassengers;
    private Integer maxSpeed;
    @Override
    public void soundSiren() {
        System.out.println("Siren goes weeeuuu weeuuu");
    }

    @Override
    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public Integer getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Police car goes vroom vroom");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }
}
