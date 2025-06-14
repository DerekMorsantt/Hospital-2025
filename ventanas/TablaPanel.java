package ventanas;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaPanel extends JScrollPane {

    public TablaPanel(String[] columnas, Object[][] datos) {
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(1600, 1000));
    }
}
