package shapeCalc.shapes;

import java.awt.Graphics;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius){ this.radius = radius;};

    @Override
    public double area(){ return Math.PI * radius * radius;}

    @Override
    public void draw(Graphics g, int width, int height){
        int size = Math.min(width , height) -20;
        int x = (width - size) /2;
        int y = (height - size) /2;
        g.drawOval(x, y, width, height);
    }  
}
