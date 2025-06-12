package paneles;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BannerPanel {
    private JPanel panelBanner;

    public BannerPanel() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}
