import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionFlotilla sistema = new GestionFlotilla(5);

        // Precargamos las 5 unidades requeridas (sin nombres de parámetros)
        sistema.agregarVehiculo(new Vehiculo("ABC-11", 12000.0));
        sistema.agregarVehiculo(new Vehiculo("XYZ-22", 5400.0));
        sistema.agregarVehiculo(new Vehiculo("DEF-33", 31000.0));
        sistema.agregarVehiculo(new Vehiculo("GHI-44", 8900.0));
        sistema.agregarVehiculo(new Vehiculo("JKL-55", 1500.0));

        int opcion = 0;
        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE GESTION DE FLOTILLA");
            System.out.println("=================================");
            System.out.println("1. Consultar vehiculos disponibles");
            System.out.println("2. Asignar chofer a vehiculo");
            System.out.println("3. Ver todos los vehiculos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 1) {
                sistema.mostrarDisponibles();
            } 
            else if (opcion == 2) {
                sistema.mostrarDisponibles(); // Filtro previo requerido
                
                System.out.print("\nEscribe la placa del vehículo: ");
                String placa = scanner.nextLine();
                
                System.out.print("Escribe el nombre completo del chofer: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Escribe el número de licencia: ");
                String licencia = scanner.nextLine();

                Chofer miChofer = new Chofer(nombre, licencia);
                boolean asignado = sistema.asignarChofer(placa, miChofer);

                if (asignado) {
                    System.out.println("¡Éxito! Chofer asignado y estatus cambiado a 'ocupado'.");
                } else {
                    System.out.println("Error: Placa no encontrada o el vehículo ya está ocupado.");
                }
            } 
            else if (opcion == 3) {
                sistema.mostrarTodos();
            }
            else if (opcion == 4) {
                System.out.println("Saliendo del sistema...");
            }
            
        } while (opcion != 4);

        scanner.close();
    }
}