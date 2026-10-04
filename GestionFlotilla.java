public class GestionFlotilla {
    private Vehiculo[] flotilla;
    private int contador;

    // Constructor para definir la capacidad (en este caso 5)
    public GestionFlotilla(int capacidad) {
        flotilla = new Vehiculo[capacidad];
        contador = 0;
    }

    // Método para agregar vehículos
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (contador < flotilla.length) {
            flotilla[contador] = vehiculo;
            contador++;
            return true;
        }
        return false;
    }

    // Buscar vehículo por placa
    public Vehiculo buscarPlaca(String placa) {
        for (int i = 0; i < contador; i++) {
            if (flotilla[i].getPlaca().equalsIgnoreCase(placa)) {
                return flotilla[i];
            }
        }
        return null;
    }

    // Mostrar únicamente las unidades disponibles (Filtro)
    public void mostrarDisponibles() {
        System.out.println("\n--- VEHÍCULOS DISPONIBLES ---");
        for (int i = 0; i < contador; i++) {
            if (flotilla[i].getEstatus().equalsIgnoreCase("disponible")) {
                System.out.println("Placa: " + flotilla[i].getPlaca() + 
                                   " | Kilometraje: " + flotilla[i].getKilometraje() + " km");
            }
        }
    }

    // Asignar chofer y cambiar estatus automáticamente a "ocupado"
    public boolean asignarChofer(String placa, Chofer chofer) {
        Vehiculo v = buscarPlaca(placa);
        if (v != null && v.getEstatus().equalsIgnoreCase("disponible")) {
            v.setChofer(chofer);
            v.setEstatus("ocupado"); // Cambio automático requerido
            return true;
        }
        return false;
    }

    // Mostrar todos los vehículos de la flotilla
    public void mostrarTodos() {
        System.out.println("\n--- ESTADO GENERAL DE LA FLOTILLA ---");
        for (int i = 0; i < contador; i++) {
            System.out.println("Placa: " + flotilla[i].getPlaca() + 
                               " | Estatus: " + flotilla[i].getEstatus());
        }
    }
}