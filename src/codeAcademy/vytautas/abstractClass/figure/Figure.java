package codeAcademy.vytautas.abstractClass.figure;


abstract class Figure {

    String name;
    Double perimeter;
    Double area;

    public Figure(String name) {
        this.name = name;
    }

    abstract Double calculateArea();
    abstract Double calculatePerimeter();
}
