package shapeCalc.shapes;

import java.awt.Graphics;

public class Square implements Shape {
    private final double side; // logical units

    public Square(double side) { this.side = side; }

    @Override
    public double area() { return side * side; }

    @Override
    public void draw(Graphics g, int width, int height) {
        // draw a square centered and scaled to panel size
        int size = Math.min(width, height) - 20;
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        g.drawRect(x, y, size, size); // simple outline
    }
}