package codeAcademy.vytautas.abstractClass.figure;

class Circle extends Figure {

    private final Double radius;

    Circle(String name, Double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    Double calculateArea() {
        return Math.sqrt(Math.PI*radius);
    }

    @Override
    Double calculatePerimeter() {
        return Math.PI*radius*2;
    }
}
