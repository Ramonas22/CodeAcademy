package codeAcademy.zilvinas.inheritance2.task2;

class TPVCAInsurance extends CarInsurance{
    private String validityTerritory;

    public TPVCAInsurance(String insuredName, Double insuranceSum, String carPlateNumber, String validityTerritory) {
        super(insuredName, insuranceSum, carPlateNumber);
        this.validityTerritory = validityTerritory;
    }

    public String getValidityTerritory() {
        return validityTerritory;
    }

    public void setValidityTerritory(String validityTerritory) {
        this.validityTerritory = validityTerritory;
    }
}
