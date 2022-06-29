package codeAcademy.zilvinas.inheritance2.task2;

class Insurance {
    private String insuredName;
    private Double insuranceSum;

    public Insurance(String insuredName, Double insuranceSum) {
        super();
        this.insuredName = insuredName;
        this.insuranceSum = insuranceSum;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public Double getInsuranceSum() {
        return insuranceSum;
    }

    public void setInsuranceSum(Double insuranceSum) {
        this.insuranceSum = insuranceSum;
    }
}
