package ventanas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import paneles.HeaderPanel;
import paneles.MenuLateralPanel;

public class Dashboard extends JFrame {

    private JPanel contenedorCentral; 
    private CardLayout layoutCentral;

    public Dashboard() {
        setTitle("Doctor");
        setSize(1900, 1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        this.add(new HeaderPanel().getPanel(), BorderLayout.NORTH);

        MenuLateralPanel menu = new MenuLateralPanel();
        this.add(menu.getPanel(), BorderLayout.WEST);

        layoutCentral = new CardLayout();
        contenedorCentral = new JPanel(layoutCentral);

        Tabla tablaPacientes = new Tabla(); 
        JPanel historialPanel = new JPanel(); 

        contenedorCentral.add(tablaPacientes, "PACIENTES");
        contenedorCentral.add(historialPanel, "HISTORIAL");

        this.add(contenedorCentral, BorderLayout.CENTER);


        menu.getBtnPacientes().addActionListener(e -> layoutCentral.show(contenedorCentral, "PACIENTES"));
        menu.getBtnHistorial().addActionListener(e -> layoutCentral.show(contenedorCentral, "HISTORIAL"));

        setVisible(true);
    }
}
