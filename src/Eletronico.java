// Clase Electrico con el atributo garantia
public class Eletronico extends Producto{
    private String garantia;

    // Constructor que hereda los atributos de Producto
    public Eletronico(String nombre, double precio, int cantidad, String garantia) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }

    // Metodo sobreescrito toString para mostrar la informacion
    @Override
    public String toString() {
        return "Eletronico{" +
                "garantia='" + garantia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
