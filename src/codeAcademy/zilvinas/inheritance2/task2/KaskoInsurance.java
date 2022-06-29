package codeAcademy.zilvinas.inheritance2.task2;

class KaskoInsurance extends CarInsurance{
    private Double franchise;

    public KaskoInsurance(String insuredName, Double insuredSum, String carNumberPlate, Double franchise){
        super(insuredName,insuredSum,carNumberPlate);
        this.franchise = franchise;
    }

    public Double getFranchise(){
        return franchise;
    }
    public void setFranchise(Double franchise){
        this.franchise = franchise;
    }
}
