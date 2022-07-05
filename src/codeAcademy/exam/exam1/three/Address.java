package codeAcademy.exam.exam1.three;

class Address {
    private City city = new City();
    private String address;

    public Address(String name, String address){
        city.setName(name);
        this.address = address;
    }
    public Address(){}

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
