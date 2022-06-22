package codeAcademy.vytautas.abstractClass.figure;

class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Rectangle", 12.0, 4.5);
        rectangle.area = rectangle.calculateArea();
        rectangle.perimeter = rectangle.calculatePerimeter();
        Figure circle = new Circle("Circle", 15.3);
        circle.perimeter = circle.calculatePerimeter();
        circle.area = circle.calculateArea();

        print(rectangle);
        print(circle);

        SpatialFigure cube = new Cube("Cube", 4.5);
        cube.area = cube.calculateArea();
        cube.perimeter = cube.calculatePerimeter();
        cube.volume = cube.calculateVolume();

        SpatialFigure cone = new Cone("Cone", 2.5, 4.0);
        cone.area = cone.calculateArea();
        cone.perimeter = cone.calculatePerimeter();
        cone.volume = cone.calculateVolume();

        print(cube);
        print(cone);
    }

    static void print(Figure object) {
        System.out.printf("Name of figure %s its perimeter is %.2f and it cover area %.2f\n", object.name, object.perimeter, object.area);
    }

    static void print(SpatialFigure object) {
        System.out.printf("Name of figure %s its perimeter is %.2f, it cover area %.2f and it has volume of %f\n",
                object.name, object.perimeter, object.area, object.volume);
    }
}
