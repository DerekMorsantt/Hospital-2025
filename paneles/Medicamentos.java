package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Medicamentos extends JScrollPane {
    private JTable table;

    public Medicamentos() {
        String[] columnas = {"Nombre", "Necesita Receta", "Dosis por Día"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0); // modelo vacío
        table = new JTable(model);
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(600, 400));
    }
    public Medicamentos(List<Medicamento> lista) {
        this(); // llama al constructor sin argumentos si tienes uno
        setMedicamentos(lista); // este método debería llenar la tabla
    }

    // Método para llenar la tabla con una lista
    public void setMedicamentos(List<Medicamento> lista) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // limpiar filas anteriores

        for (Medicamento m : lista) {
            Object[] fila = {
                    m.getNombreMedicamento(),
                    m.getNecesitaReceta() ? "Sí" : "No",
                    m.getDosisXDia()
            };
            model.addRow(fila);
        }
    }
}
