package shapeCalc.shapes;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape create(String[] params) {
        // expect params[0] = side length as string
        double side = 50.0;
        if (params != null && params.length > 0) {
            try { side = Double.parseDouble(params[0]); } catch(Exception ignored) {}
        }
        return new Square(side);
    }
}