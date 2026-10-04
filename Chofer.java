public class Chofer {
    private String nombreCompleto;
    private String numeroLicencia;

    // Constructor que pide el diagrama
    public Chofer(String nombreCompleto, String numeroLicencia) {
        this.nombreCompleto = nombreCompleto;
        this.numeroLicencia = numeroLicencia;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}