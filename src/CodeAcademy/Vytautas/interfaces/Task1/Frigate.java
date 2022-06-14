package CodeAcademy.Vytautas.interfaces.Task1;

class Frigate implements SeaVessel {
    private final Integer[] displacement = new Integer[2];
    private String name;
    private Integer maxPassengers;
    private Integer maxSpeed;

    void fireGun() {
        System.out.println("Gun fired");
    }

    @Override
    public void setDisplacement(Integer x, Integer y) {
        this.displacement[0] = x;
        this.displacement[1] = y;
    }

    @Override
    public Integer[] getDisplacement() {
        return this.displacement;
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
