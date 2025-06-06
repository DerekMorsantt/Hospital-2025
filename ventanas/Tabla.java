package ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JScrollPane {  // Ahora es un componente JScrollPane

    public Tabla() {
        // Columnas y datos
        String[] columnas = {"ID", "Nombre", "Edad"};
        Object[][] datos = {
            {1, "Ana", 20},
            {2, "Luis", 22},
            {3, "María", 19}
        };

        // Crear modelo y tabla
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        
        // Configurar este JScrollPane para contener la tabla
        this.setViewportView(table);
        this.setBounds(50, 50, 400, 200); // Posición y tamaño
    }
}