/* 
 * 
Design a class ComplexNumber that models complex numbers. Write a copy constructor that
takes another ComplexNumber object and initializes the current object’s real and imaginary
parts with the copied values.
 * 
 */

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

public class pract3 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.8);
        System.out.print("Original: ");
        c1.display();

        ComplexNumber c2 = new ComplexNumber(c1);
        System.out.print("Copy: ");
        c2.display();
    }
}
