package paneles;

public class Medicamento {

    private String nombreMedicamento;
    private boolean necesitaReceta;
    private int dosisXDia;

    public Medicamento(String nombreMedicamento, boolean necesitaReceta, int dosisXDia){
        this.nombreMedicamento = nombreMedicamento;
        this.necesitaReceta = necesitaReceta;
        this.dosisXDia = dosisXDia;
    }

    // Getters
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public boolean getNecesitaReceta() {
        return necesitaReceta;
    }

    public int getDosisXDia() {
        return dosisXDia;
    }

    // Setters (opcional)
    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setNecesitaReceta(boolean necesitaReceta) {
        this.necesitaReceta = necesitaReceta;
    }

    public void setDosisXDia(int dosisXDia) {
        this.dosisXDia = dosisXDia;
    }
}
