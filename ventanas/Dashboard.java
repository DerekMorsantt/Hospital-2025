package ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import paneles.HeaderPanel;
import paneles.MenuLateralPanel;

public class Dashboard extends JFrame {
    
    public Dashboard() {
        setTitle("Doctor");
        setSize(1900, 1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

             this.add(new HeaderPanel().getPanel(),BorderLayout.NORTH);

        this.add(new MenuLateralPanel().getPanel(),BorderLayout.EAST);
        
        // Crear e integrar la tabla
        Tabla tabla = new Tabla();
        this.add(tabla, BorderLayout.EAST); // Agregar directamente al JFrame
        
    
        setVisible(true);
    }
}