package shapeCalc;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;

public class ShapeCalc extends Frame {
    public ShapeCalc(String title){
        super(title);
    }

    @Override
    public void initialize(){
        setSize(400, 400);  
        setLocationRelativeTo(null); //center

        Container cp = getContentPane();

        JPanel controlPanel = new JPanel();
        DrawingPanel drawing = new DrawingPanel();
        final JPanel areaLabel = new JPanel();
        
        cp.add(controlPanel, BorderLayout.NORTH);
        cp.add(drawing, BorderLayout.CENTER);
        cp.add(areaLabel, BorderLayout.SOUTH);
        
        final JTextField typeTextField = new JTextField("Square", 12);
        JButton newButton = new JButton("New ...");
        
        controlPanel.add(typeTextField);
        controlPanel.add(newButton);
        
        newButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e){
                String type = typeTextField.getText().trim();
                String param = JOptionPane.showInputDialog(ShapeCalc.this, "Enter size (e.g. side or radius): ", "10");

                shapeCalc.shapes.ShapeFactory factory;
                if("Circle".equalsIgnoreCase(type)) { factory = new shapeCalc.shapes.CircleFactory();}
                else factory = new shapeCalc.shapes.SquareFactory();

                shapeCalc.shapes.Shape shape = factory.create(new String[]{param});
                drawing.setShape(shape);
                areaLabel.setBorder(BorderFactory.createTitledBorder("Area: %.2f" + shape.area() ));
            }
        });
    }
}