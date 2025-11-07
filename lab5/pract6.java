/*
 * Implement a class Polynomial that models a polynomial equation. Use a constructor that
 * takes a variable number of coefficients (using varargs) and initializes the polynomial. Write a
 * method to display the polynomial in a readable format (e.g., 3x^2 + 2x + 1).
 */

class Polynomial {
    private double[] c;

    public Polynomial(double... c) {
        this.c = c;
    }

    public void display() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) continue;
            int p = c.length - 1 - i;
            System.out.print((i > 0 && c[i] > 0 ? "+" : "") + c[i]);
            if (p > 0) System.out.print("x");
            if (p > 1) System.out.print("^" + p);
        }
        System.out.println();
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
