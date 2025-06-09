import java.awt.BorderLayout;
import javax.swing.*;

import paneles.BannerPanel;
import paneles.LoginPanel;
public class Main {

    public static void main(String[] args) {

        JFrame miVentana = new JFrame(); 
        
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);

        LoginPanel loginPanel = new LoginPanel();
        miVentana.add(loginPanel.getPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);

        BannerPanel panelBanner = new BannerPanel();
        miVentana.add(panelBanner.getBanner(), BorderLayout.WEST);

    }
}
