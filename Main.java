import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.loginPanel;
public class Main {

    public static void main(String[] args) {

        JFrame miVentana = new JFrame(); 
        
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner, BorderLayout.WEST);

        loginPanel loginPanel = new loginPanel();
        miVentana.add(loginPanel.getPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}
