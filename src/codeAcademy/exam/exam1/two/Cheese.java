package codeAcademy.exam.exam1.two;

class Cheese extends Product{
    Cheese(){
        super((int) (Math.random()*(4)+1));
    }
    @Override
    boolean canBeConsumed() {
        if(super.protectedInt == 1 || super.protectedInt == 2 || super.protectedInt == 3){
            return true;
        }
        return false;
    }
}
