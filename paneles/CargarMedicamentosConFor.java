package paneles;

import java.util.*;

public class CargarMedicamentosConFor {

    public static List<Medicamento> cargarLista() {
        List<Medicamento> lista = new ArrayList<>();

        String[] nombres = {"Paracetamol", "Ibuprofeno", "Amoxicilina"};
        boolean[] recetas = {false, false, true};
        int[] dosis = {3, 2, 2};

        for (int i = 0; i < nombres.length; i++) {
            Medicamento m = new Medicamento("", false, 0);
            m.setNombreMedicamento(nombres[i]);
            m.setNecesitaReceta(recetas[i]);
            m.setDosisXDia(dosis[i]);
            lista.add(m);
        }

        return lista;
    }
}
