package vistas;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import ventanas.*;
import control.loginControl;


public class loginPanel {
    private JPanel loginPanel;

    public loginPanel() {
        loginPanel = new JPanel();
        loginPanel.setSize(500, 800);
        loginPanel.setOpaque(true);
        loginPanel.setLayout(new GridBagLayout());

        //ADMINISTRADOR DE DISENNO
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        //TITULO
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        gbc.gridx = 2;
        gbc.gridy =0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;

        loginPanel.add(titulo, gbc);

        // Entrada correo
        JTextField entradaCorreo = new JTextField();
        entradaCorreo.setPreferredSize(new Dimension(100, 50));
        loginPanel.add(entradaCorreo);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;  
        gbc.weightx = 1.0;
        entradaCorreo.setText("");
        loginPanel.add(entradaCorreo, gbc);

        // Entrada contrasenna
        JTextField entradaContrasenna = new JTextField();
        entradaContrasenna.setPreferredSize(new Dimension(100, 50));
        loginPanel.add(entradaContrasenna);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        entradaContrasenna.setText("");
        loginPanel.add(entradaContrasenna, gbc);

        // Boton 
        JButton boton = new JButton("Ingresar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        loginPanel.add(boton, gbc);


boton.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        
            String entradaUsuario =entradaCorreo.getText();
            String entradaContra=entradaContrasenna.getText();
         
        if (new loginControl().validacionDatos(entradaUsuario, entradaContra)) {
            new Dashboard();
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginPanel);
            frame.dispose();
        }
 
    }
});
    }

    public JPanel getPanel() {
        return loginPanel;
    }
}

