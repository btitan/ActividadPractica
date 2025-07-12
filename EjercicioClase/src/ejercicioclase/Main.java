// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Producto
        producto producto = new producto("pc", "Laptop", 500);

        // Imprimir la información del producto
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: Q" + producto.getPrecio());
    }
}

