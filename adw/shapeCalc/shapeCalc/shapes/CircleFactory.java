package shapeCalc.shapes;

public class CircleFactory implements ShapeFactory {
    public Shape create(String[] params){
        double r = 10.0;
        if(params != null && params.length > 0){
            try{ r = Double.parseDouble(params[0]);} catch(Exception ignored){};
        }

        return new Circle(r);
    }
}
