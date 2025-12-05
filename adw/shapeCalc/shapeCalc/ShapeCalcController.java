package shapeCalc;

import javax.swing.SwingUtilities;

/** Controller: application entry point */
public class ShapeCalcController {
    public ShapeCalcController() {
        new ShapeCalc("Shape Calculator").setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapeCalcController());
    }
}