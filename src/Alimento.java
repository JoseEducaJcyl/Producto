// Clase Alimento con el atributo garantia
public class Alimento extends Producto {
    private String fechaCaducidad;

    // Constructor que hereda los atributos de Productos
    public Alimento(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    // Metodo sobreescrito toString para mostrar la informacion
    @Override
    public String toString() {
        return "Alimento{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
