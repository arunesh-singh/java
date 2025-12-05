
package shapeCalc;

import javax.swing.*;

public abstract class Frame extends JFrame {

    public Frame(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initialize();
    }

    protected abstract void initialize();
}
