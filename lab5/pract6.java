/*
 * Implement a class Polynomial that models a polynomial equation. Use a constructor that
 * takes a variable number of coefficients (using varargs) and initializes the polynomial. Write a
 * method to display the polynomial in a readable format (e.g., 3x^2 + 2x + 1).
 */

class Polynomial {
    private double[] coefficients;

    public Polynomial(double... coefficients) {
        this.coefficients = coefficients;
    }

    public void display() {
        if (coefficients.length == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder polynomial = new StringBuilder();
        int degree = coefficients.length - 1;

        for (int i = 0; i < coefficients.length; i++) {
            double coeff = coefficients[i];
            int power = degree - i;

            if (coeff == 0) continue;

            if (polynomial.length() > 0 && coeff > 0) {
                polynomial.append(" + ");
            } else if (coeff < 0) {
                if (polynomial.length() > 0) {
                    polynomial.append(" - ");
                    coeff = Math.abs(coeff);
                }
            }

            if (power == 0) {
                polynomial.append(coeff);
            } else if (power == 1) {
                if (coeff == 1) {
                    polynomial.append("x");
                } else if (coeff == -1) {
                    polynomial.append("-x");
                } else {
                    polynomial.append(coeff).append("x");
                }
            } else {
                if (coeff == 1) {
                    polynomial.append("x^").append(power);
                } else if (coeff == -1) {
                    polynomial.append("-x^").append(power);
                } else {
                    polynomial.append(coeff).append("x^").append(power);
                }
            }
        }

        System.out.println(polynomial.length() > 0 ? polynomial.toString() : "0");
    }
}

public class pract6 {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(3, 2, 1);
        System.out.print("Polynomial 1: ");
        p1.display();

        Polynomial p2 = new Polynomial(5, -3, 0, 7);
        System.out.print("Polynomial 2: ");
        p2.display();

        Polynomial p3 = new Polynomial(1, 0, -4, 0, 2);
        System.out.print("Polynomial 3: ");
        p3.display();
    }
}
