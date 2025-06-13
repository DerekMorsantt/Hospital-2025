package ventanas;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import data.Pacientes;

public class TablaPanel extends JScrollPane {  // Ahora es un componente JScrollPane

    public TablaPanel() {
        // Columnas y datos
        String[] columnas = {"ID del paciente", "Nombre del paciente", "Edad"};
        Object[][] datos = new Pacientes().getDatos();

        // Crear modelo y tabla
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        
        // Configurar este JScrollPane para contener la tabla
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(1600,1000));
        
    }
}