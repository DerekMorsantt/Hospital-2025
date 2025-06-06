package ventanas;

import javax.swing.JFrame;

public class Dashboard extends JFrame {
    
    public Dashboard() {
        setTitle("Doctor");
        setSize(1900, 1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Layout nulo para posicionar manualmente
        
        // Crear e integrar la tabla
        Tabla tabla = new Tabla();
        add(tabla); // Agregar directamente al JFrame
        
        setVisible(true);
    }
}