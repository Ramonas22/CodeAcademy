package codeAcademy.vytautas.test.test1;

class CalculateNPD {

    protected static Double grossNPD(Double salary) {
        if (salary > Const.MINIMAL_SALARY) {
            if (salary <= 1678) {
                return 460 - 0.26 * (salary - 730);
            } else if (salary >= 400 - 0.18 * (salary - 642) && 0 < 400 - 0.18 * (salary - 642)) {
                return 400 - 0.18 * (salary - 642);
            } else {
                return 0.0;
            }
        } else if(salary >= 460){
            return 460.0;
        }else {
            return salary;
        }
    }

    //Work in progress
    protected static Double netNPD(Double salary) {
        if (salary > Const.MINIMAL_SALARY) {
            if (salary <= 1057.894) {
                return 460 - 0.26 * (salary - 730);
            } else if (salary >= 400 - 0.18 * (salary - 642) && 0 < 400 - 0.18 * (salary - 642)) {
                return 400 - 0.18 * (salary - 642);
            } else {
                return 0.0;
            }
        } else if(salary >= 460){
            return 460.0;
        }else {
            return salary;
        }
    }
}
