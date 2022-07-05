package codeAcademy.vytautas.test.test1;

public class SalaryConverter {

    public static Double grossIncomeToNet(Double salaryGross) {

        //Darbuotojo sumokami mokesciai
        double employeeTaxes = (salaryGross - CalculateNPD.grossNPD(salaryGross)) * Const.INCOME_TAX
                + salaryGross * (
                Const.PENSION_INSURANCE
                        + Const.MANDATORY_HEALTH_INSURANCE
                        + Const.ILLNESS_SOCIAL_INSURANCE
                        + Const.MOTHERHOOD_SOCIAL_INSURANCE);

        return salaryGross - employeeTaxes;
    }

    public static Double netIncomeToGross(Double salaryNet) {

        //Darbuotojo sumokami mokesciai
        double employeeTaxes = (salaryNet - CalculateNPD.netNPD(salaryNet)) * Const.INCOME_TAX
                + salaryNet * (
                Const.PENSION_INSURANCE
                        + Const.MANDATORY_HEALTH_INSURANCE
                        + Const.ILLNESS_SOCIAL_INSURANCE
                        + Const.MOTHERHOOD_SOCIAL_INSURANCE);

        double x = salaryNet - employeeTaxes;

        //Darbuotojo sumokami mokesciai
        return salaryNet * salaryNet / x;
    }
}
