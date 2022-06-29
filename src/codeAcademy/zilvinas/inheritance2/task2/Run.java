package codeAcademy.zilvinas.inheritance2.task2;

class Run {
    public static void main(String[] args) {

        Insurance insurance = new TPVCAInsurance("John Doe", 1000.0 , "ABC123" , "Lithuania");
        System.out.println("\nInsured person name " + insurance.getInsuredName() + " insured sum " + insurance.getInsuranceSum());
        System.out.println("Car plate number " + ((CarInsurance) insurance).getCarPlateNumber());
        System.out.println("Territory of validity " + ((TPVCAInsurance) insurance).getValidityTerritory());

        Insurance insurance1 = new KaskoInsurance("Kasko Fiasko" , 1200.0, "KDN250" , 2500.1);
        System.out.printf("\nInsured person name %s, insured sum: %.2f", insurance1.getInsuredName(), insurance1.getInsuranceSum());
        System.out.printf("\nCar plate number %s", ((CarInsurance) insurance1).getCarPlateNumber());
        System.out.printf("\nFranchise %.2f", ((KaskoInsurance) insurance1).getFranchise());

        CarInsurance carInsurance = new CarInsurance("Barbora Rackaite" , 500.0 , "BTZ123");
        Insurance insurance3 = carInsurance;

        System.out.println("\n\nInsured person name " + insurance3.getInsuredName() + " insured sum " + insurance3.getInsuranceSum());
        System.out.printf("Car plate %s" , ((CarInsurance) insurance3).getCarPlateNumber());
    }
}
