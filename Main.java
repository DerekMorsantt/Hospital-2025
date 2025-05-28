import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.bannerPanel;
import vistas.loginPanel;
public class Main {

    public static void main(String[] args) {

        JFrame miVentana = new JFrame(); 
        
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        loginPanel loginPanel = new loginPanel();
        miVentana.add(loginPanel.getPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);

        bannerPanel panelBanner = new bannerPanel();
        miVentana.add(panelBanner.getBanner(), BorderLayout.WEST);

        
    }
}
