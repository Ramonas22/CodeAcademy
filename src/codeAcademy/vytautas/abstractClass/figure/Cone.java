package codeAcademy.vytautas.abstractClass.figure;

class Cone extends SpatialFigure {

    private final Double radius;
    private final Double height;

    Cone(String name, Double radius, Double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    Double calculateArea() {
        return Math.PI*radius*(radius + Math.pow((Math.pow(radius,2) + Math.pow(height,2)), 1.0/2.0 ));
    }

    @Override
    Double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    Double calculateVolume() {
        return Math.PI*Math.pow(radius,2)*1/3*height;
    }
}
