package codeAcademy.vytautas.abstractClass.figure;

class Cube extends SpatialFigure{

    private final Double length;

    Cube(String name, Double length){
        super(name);
        this.length = length;
    }
    @Override
    Double calculateArea() {
        return Math.pow(length, 2)*6;
    }

    @Override
    Double calculatePerimeter() {
        return 12* length;
    }

    @Override
    Double calculateVolume() {
        return Math.pow(length, 3.0);
    }
}
