public class Vehiculo {
    private String codigo; // Código único del vehículo
    private String marca; // Marca del vehículo
    private String tipo; // Tipo de vehículo (Auto, Camioneta, Motocicleta)
    private int modelo; // Año del modelo
    private double kilometraje; // Kilometraje del vehículo

    // Constructor de la clase Vehiculo
    // */
    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    // Método toString para representar la información del vehículo en texto
    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]";
    }
}
