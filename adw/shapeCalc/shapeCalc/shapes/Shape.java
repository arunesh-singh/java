package shapeCalc.shapes;

import java.awt.Graphics;

public interface Shape {
    double area();

    void draw(Graphics g, int width, int height);
}