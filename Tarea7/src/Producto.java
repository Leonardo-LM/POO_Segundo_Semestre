import java.util.ArrayList;

public class Producto {
    private String nombre;
    private Double precio;
    private int stock;

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, Double precio) {
        this.stock = 0;

    }

    public void aumentarStock(int stock) {
        if (stock <= 0) {
            System.out.println("No se agrego nada al stock");
        } else {
            this.stock += stock;
            System.out.println("Producto aumentado correctamente");
        }

    }

    public void reducirStock(int stock) {

        if (stock > 0 && stock <= this.stock) {
            this.stock -= stock;
            System.out.println("Producto reducido correctamente");

        } else {
            System.out.println("No se puede elimanra esa cantidad");

        }
    }

    public void mostrarProducto() {
        System.out.println("\n*** PRODUCTO ***");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < -1) {
            System.out.println("Ingrese un numero positivo");
            return;
        } else {
           aumentarStock(stock);
        }
    }
}
