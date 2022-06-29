package codeAcademy.zilvinas.inheritance2.task2;

class CarInsurance extends Insurance{
    private String carPlateNumber;

    public CarInsurance(String insuredName, Double insuranceSum, String carPlateNumber) {
        super(insuredName, insuranceSum);
        this.carPlateNumber = carPlateNumber;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }
}
