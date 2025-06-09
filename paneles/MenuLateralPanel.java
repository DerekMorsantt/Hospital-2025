package paneles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel{
    
    public MenuLateralPanel(){
        this.setSize(new Dimension(300,1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

    public JPanel getPanel(){
        return this;
    }
}
