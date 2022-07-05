package codeAcademy.vytautas.test.test1;

class Main {
    public static void main(String[] args) {
        System.out.println(SalaryConverter.grossIncomeToNet(2000.0));
        System.out.println(SalaryConverter.netIncomeToGross(SalaryConverter.grossIncomeToNet(10000.0)));
    }
}
