package vistas;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class bannerPanel {
    private JPanel panelBanner;

    public bannerPanel() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}
