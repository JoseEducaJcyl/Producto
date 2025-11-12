// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        // Se crean dos objetos que se extiende de la clase Producto
        // producto1 y producto2
        Producto producto1 =  new Eletronico("iphone",999.9,5,
                "Un año");
        Producto producto2 = new Alimento("pan",2.99,100,
                "01/12/2025");
        // Se muestra sus datos a traves del metodo toString()
        System.out.println("Producto 1: " + producto1.toString());
        System.out.println("Producto 2: " + producto2.toString());
    }
}
