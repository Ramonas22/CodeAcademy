package codeAcademy.exam.exam1.two;


class Milk extends Product{

    Milk(){
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
