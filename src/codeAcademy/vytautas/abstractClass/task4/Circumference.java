package codeAcademy.vytautas.abstractClass.task4;

class Circumference extends Figure{

    @Override
    double getArea(Integer length) {
        return Math.sqrt(length)*Math.PI;
    }

    @Override
    double getPerimeter(Integer length) {
        return 2*Math.PI*length;
    }
}
