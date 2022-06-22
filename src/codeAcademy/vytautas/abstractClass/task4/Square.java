package codeAcademy.vytautas.abstractClass.task4;

class Square extends Figure{
    @Override
    double getArea(Integer length) {
        return length*length;
    }

    @Override
    double getPerimeter(Integer length) {
        return length*4;
    }
}
