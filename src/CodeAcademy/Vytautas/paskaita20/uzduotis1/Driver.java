package CodeAcademy.Vytautas.paskaita20.uzduotis1;


import java.util.ArrayList;

class Driver {
    private String name;
    private String licenseNumber;
    private int experience;

    Driver(){}

    Driver(String name, String licenseNumber, int experience){
        this.name = name;
        this.licenseNumber= licenseNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    static void mostExperiencedDriver(ArrayList<Driver> driverArrayList){
        int index = 0;

        for (int i = 1; i < driverArrayList.size(); i++) {
            if(driverArrayList.get(index).getExperience() < driverArrayList.get(i).getExperience()){
                index = i;
            }
        }
        showDriver(driverArrayList, index);
    }

    static void showDriver(ArrayList<Driver> driverArrayList, int index){
        System.out.println("\nDriver name " + driverArrayList.get(index).getName()
                            +"\nLicense plate number " + driverArrayList.get(index).getLicenseNumber()
                            +"\nExperience driving " + driverArrayList.get(index).getExperience() + "\n");
    }

}
