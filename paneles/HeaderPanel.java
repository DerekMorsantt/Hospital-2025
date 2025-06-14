package paneles;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    
    public HeaderPanel() {
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(1000, 65));
        this.setLayout(new GridBagLayout());

        // Tamaño de la letra
        Font largeFont = new Font("Arial", Font.BOLD, 25);
        

        GridBagConstraints gbc = new GridBagConstraints();
       
        
       
 JLabel vista = new JLabel("Hospital");
        vista.setFont(largeFont);
        vista.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        this.add(vista, gbc);
        
       
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        this.add(Box.createGlue(), gbc);
        
        // Nombre del doctor (derecha)
        JLabel nombreDoctor = new JLabel("Dr. Derek Morales");
        nombreDoctor.setFont(largeFont);
        nombreDoctor.setForeground(Color.BLACK);
        gbc.gridx = 2;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        this.add(nombreDoctor, gbc);
    }
    
    public JPanel getPanel() {
        return this;
    }
}