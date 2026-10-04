public class Vehiculo {
    private String placa;
    private double kilometraje;
    private String estatus;
    private Chofer chofer; // Relación 0..1 con Chofer

    // Constructor que pide el diagrama
    public Vehiculo(String placa, double kilometraje) {
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.estatus = "disponible"; // Inicia disponible por defecto
        this.chofer = null;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getEstatus() {
        return estatus;
    }

    public Chofer getChofer() {
        return chofer;
    }

    // Setters
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
}
