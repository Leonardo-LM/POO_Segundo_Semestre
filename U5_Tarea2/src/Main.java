import excepcionesPersonalizadas.Excepciones.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = scanner.nextInt();

            Producto producto = new Producto(nombre, precio, cantidad);
            listaProductos.add(producto);
            System.out.println("\nProducto agregado correctamente\n");

            producto.mostrarDetalles();

        } catch (ProductoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}