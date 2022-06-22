package codeAcademy.vytautas.abstractClass.task4;

class Main {

    public static void main(String[] args) {

        Figure a = new Circumference();
        Figure k = new Square();

        System.out.println("Circumference of radius  5 area is " + a.getArea(5) + " perimeter "  +a.getPerimeter(5));
        System.out.println("Square which side length is 5 area is " + k.getArea(5) + " perimeter " + k.getPerimeter(5));
    }
}
