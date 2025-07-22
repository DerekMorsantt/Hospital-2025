package ventanas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import paneles.HeaderPanel;
import paneles.Medicamentos;
import paneles.MenuLateralPanel;
import paneles.CargarMedicamentosConFor;
import paneles.Medicamento;

import data.Pacientes;

import java.util.List;

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

        // Tabla de pacientes
        String[] columnasPacientes = {"ID del paciente", "Nombre del paciente", "Edad"};
        Object[][] datosPacientes = new Pacientes().getDatos();
        TablaPanel tablaPacientes = new TablaPanel(columnasPacientes, datosPacientes);

        // Tabla historial
        String[] columnasHistorial = {"Paciente", "Fecha", "Diagnóstico"};
        Object[][] datosHistorial = {
                {"Miguel", "2025-06-10", "Gripe"},
                {"Laura", "2025-06-11", "Dolor estomacal"},
                {"Ana", "2025-06-12", "Alergia"},
                {"Carlos", "2025-06-13", "Infección"},
                {"Luis", "2025-06-14", "Dolor de cabeza"},
                {"Renata", "2025-06-15", "Fiebre"}
        };
        TablaPanel tablaHistorial = new TablaPanel(columnasHistorial, datosHistorial);

        // Tabla agendar
        String[] columnasAgendar = {"ID", "Nombre del Paciente", "Fecha de Cita"};
        Object[][] datosAgendar = {
                {1, "Ana", "2025-06-15"},
                {2, "Luis", "2025-06-16"},
                {3, "María", "2025-06-17"},
                {4, "Pedro", "2025-06-18"},
                {5, "Valeria", "2025-06-19"}
        };
        TablaPanel tablaAgendar = new TablaPanel(columnasAgendar, datosAgendar);

        // Tabla farmacia
        String[] columnasFarmacia = {"Medicamento", "Cantidad", "Disponible"};
        Object[][] datosFarmacia = {
                {"Paracetamol", 50, "Sí"},
                {"Ibuprofeno", 30, "Sí"},
                {"Amoxicilina", 20, "Sí"},
                {"Omeprazol", 15, "Sí"},
                {"Cetirizina", 40, "Sí"}
        };
        TablaPanel tablaFarmacia = new TablaPanel(columnasFarmacia, datosFarmacia);

        // Tabla exámenes
        String[] columnasExamenes = {"Paciente", "Examen", "Resultado"};
        Object[][] datosExamenes = {
                {"Carlos", "Sangre", "Normal"},
                {"Sofía", "Rayos X", "Fractura leve"},
                {"Valeria", "Orina", "Leve infección"},
                {"Jorge", "Electrocardiograma", "Normal"},
                {"Lucía", "Resonancia", "Sin anomalías"}
        };
        TablaPanel tablaExamenes = new TablaPanel(columnasExamenes, datosExamenes);

        // Tabla medicamentos (dinámica con lista)
        List<Medicamento> listaMedicamentos = CargarMedicamentosConFor.cargarLista();
        Medicamentos tablaMedicamentos = new Medicamentos(listaMedicamentos);

        // Añadir todas las tablas al contenedor central
        contenedorCentral.add(tablaPacientes, "PACIENTES");
        contenedorCentral.add(tablaHistorial, "HISTORIAL");
        contenedorCentral.add(tablaAgendar, "AGENDAR");
        contenedorCentral.add(tablaFarmacia, "FARMACIA");
        contenedorCentral.add(tablaExamenes, "EXAMENES");
        contenedorCentral.add(tablaMedicamentos, "MEDICAMENTOS");

        this.add(contenedorCentral, BorderLayout.CENTER);

        // Botones del menú lateral
        menu.getBtnPacientes().addActionListener(e -> layoutCentral.show(contenedorCentral, "PACIENTES"));
        menu.getBtnHistorial().addActionListener(e -> layoutCentral.show(contenedorCentral, "HISTORIAL"));
        menu.getBtnAgendar().addActionListener(e -> layoutCentral.show(contenedorCentral, "AGENDAR"));
        menu.getBtnFarmacia().addActionListener(e -> layoutCentral.show(contenedorCentral, "FARMACIA"));
        menu.getBtnExamenes().addActionListener(e -> layoutCentral.show(contenedorCentral, "EXAMENES"));
        menu.getBtnMedicamentos().addActionListener(e -> layoutCentral.show(contenedorCentral, "MEDICAMENTOS"));

        setVisible(true);
    }
}
