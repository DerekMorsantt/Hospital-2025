package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel {

    private JButton btnHistorial;
    private JButton btnPacientes;
    private JButton btnAgendar;
    private JButton btnFarmacia;
    private JButton btnExamenes;
    private JButton btnResidencia;

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(300, 1000));

        
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets.top = 10; 


        btnHistorial = new JButton("Consultas");
        btnHistorial.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnHistorial, gbc);

        gbc.gridy = 1;
        btnPacientes = new JButton("Pacientes");
        btnPacientes.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnPacientes, gbc);

        gbc.gridy = 2;
        btnAgendar = new JButton("Agendar");
        btnAgendar.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnAgendar, gbc);


        gbc.gridy = 3;
        btnFarmacia = new JButton("Farmacia");
        btnFarmacia.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnFarmacia, gbc);

        gbc.gridy = 4;
        btnExamenes = new JButton("Examenes");
        btnExamenes.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnExamenes, gbc);

        gbc.gridy = 5;
        btnResidencia = new JButton("Residencia");
        btnResidencia.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(btnResidencia, gbc);
    }

    public JPanel getPanel() {
        return this;
    }

    public JButton getBtnHistorial() {
        return btnHistorial;
    }

    public JButton getBtnPacientes() {
        return btnPacientes;
 }

 public JButton getBtnExamenes(){
    return btnExamenes;
 }

 public JButton getBtnAgendar() {
    return btnAgendar;
}

public JButton getBtnFarmacia() {
    return btnFarmacia;
}

public JButton getBtnResidencia() {
    return btnResidencia;
}

}
