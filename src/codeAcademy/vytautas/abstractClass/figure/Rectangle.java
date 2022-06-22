package codeAcademy.vytautas.abstractClass.figure;

class Rectangle extends Figure{

    private final Double length, height;

    Rectangle(String name, Double length, Double height){
        super(name);
        this.name = name;
        this.length = length;
        this.height = height;
    }

    @Override
    Double calculateArea() {
        return length*height;
    }

    @Override
    Double calculatePerimeter() {
        return (length+height)*2;
    }
}
