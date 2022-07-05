package codeAcademy.exam.exam1.two;

class Yogurt extends Product{
    Yogurt(){
        super((int) (Math.random()*(4)+1));
    }
    @Override
    boolean canBeConsumed() {
        if(super.protectedInt == 1 || super.protectedInt == 2){
            return true;
        }
        return false;
    }
}
