/*
 * Create an interface Shape that has methods double area() and double perimeter().
 * Implement this interface in two classes: Circle and Rectangle. The Circle class should
 * calculate the area and perimeter using the radius, and the Rectangle class should use the
 * length and width.
 */

interface ShapeInterface {
    double area();
    double perimeter();
}

class CircleShape implements ShapeInterface {
    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle - Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class RectangleShape implements ShapeInterface {
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class pract7 {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape(5.0);
        RectangleShape rectangle = new RectangleShape(4.0, 6.0);

        System.out.println("Circle Details:");
        circle.display();

        System.out.println("\nRectangle Details:");
        rectangle.display();
    }
}
