
class CalculateArea {

    private double area;

    public double area(double radius) {
        area = Math.PI * radius * radius;
        return area;
    }

    public double area(double length, double breadth) {
        area = length * breadth;
        return area;
    }

    public double area(double base, double height, boolean isTriagle) {
        area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        CalculateArea calculator = new CalculateArea();

        double circleArea = calculator.area(5.0);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = calculator.area(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double triangleArea = calculator.area(7.0, 3.0, true);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
