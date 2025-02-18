public class Producto {
    // Atributos
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método mostrarProducto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
