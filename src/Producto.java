// Clase abstracta con los atributos
// nombre, nombre, precio y cantidad
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Declaramos un constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
