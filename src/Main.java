public class Main {
    public static void main(String[] args) {
        // Crear un concesionario
        Concesionario concesionario = new Concesionario();

        // Agregar vehículos al inventario
        concesionario.agregarVehiculo(new Vehiculo("001", "Toyota", "Auto", 2020, 0));
        concesionario.agregarVehiculo(new Vehiculo("002", "Chevrolet", "Camioneta", 2018, 50000));
        concesionario.agregarVehiculo(new Vehiculo("003", "Suzuki", "Motocicleta", 2019, 10000));

        // Mostrar el inventario La línea concesionario.mostrarInventario(); llama al método mostrarInventario del objeto Concesionario.
        // Este método imprime en la consola una lista de todos los vehículos actualmente disponibles en el inventario del concesionario.*/
        concesionario.mostrarInventario();

        // Realizar una venta
        concesionario.realizarVenta("002", 25000, "Pérez", "Juan", "12345678");
        concesionario.realizarVenta("003", 48000, "Jimenez", "Isabella", "1027810672");
        concesionario.realizarVenta("000", 12000, "Jimenez", "Mario", "1027810672");
        // Mostrar el inventario y las ventas
        concesionario.mostrarInventario();
        concesionario.mostrarVentas();
    }
}
