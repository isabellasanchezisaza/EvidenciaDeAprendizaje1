public class Venta {
    private double monto; // Monto de la venta
    private Vehiculo vehiculo; // Vehículo vendido
    private String apellido; // Apellido del comprador
    private String nombre; // Nombre del comprador
    private String documento; // Documento de identidad del comprador

    // Constructor de la clase Venta
    // constructor con parámetros
    public Venta(double monto, Vehiculo vehiculo, String apellido, String nombre, String documento) {
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    // Método toString para representar la venta en texto
    //Este método devuelve una cadena que describe la venta de un vehículo,
    // incluyendo el vehículo, el monto de la venta y los datos del comprador.// */
    @Override
    public String toString() { //constructor vacío
        return "Venta de " + vehiculo.toString() + " por $" + monto + " a " + nombre + " " + apellido + " (DNI: " + documento + ")";
    }
}
