package CodeAcademy.Zilvinas.abstractClass.Task4;

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
