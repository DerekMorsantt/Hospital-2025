package paneles;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Medicamentos extends JScrollPane {

    public Medicamentos(String[] columnas, Object[][] datos) {
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(1600, 1000));
    }
}