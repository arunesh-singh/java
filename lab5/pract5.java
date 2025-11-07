/*
 * Write an abstract class Shape that has a parameterized constructor to initialize the color of the
 * shape. Extend this class in Circle and Rectangle, which will have their own additional
 * parameters (like radius, length, width). Ensure proper constructor calls using super().
 */

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public void display() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + radius + ", Area: " + area());
    }
}

class Rect extends Shape {
    private double length;
    private double width;

    public Rect(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }
}

public class pract5 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rect rectangle = new Rect("Blue", 4.0, 6.0);

        System.out.println("Circle Details:");
        circle.display();

        System.out.println("\nRectangle Details:");
        rectangle.display();
    }
}
