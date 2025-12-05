package shapeCalc;

import javax.swing.JPanel;
import java.awt.Graphics;
import shapeCalc.shapes.Shape;

public class DrawingPanel extends JPanel {
    private Shape currentShape;

    public void setShape(Shape s){
        this.currentShape = s;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(currentShape != null){
            currentShape.draw(g, getWidth(), getHeight());
        }else {
            g.drawString("No Shape", 10, 20);
        }
    }
}
