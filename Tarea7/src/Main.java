import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        Double precio = scanner.nextDouble();

        System.out.print("Ingrese el stock del producto: ");
        int stock = scanner.nextInt();

        Producto producto = new Producto(nombre, precio, stock);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("""
                    \n*** BIENVENIDO ***
                    1.- Agregar stock al producto
                    2.- Eliminar stock al producto
                    3.- Mostrar producto
                    4.- salir""");

            System.out.print("Eliga una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cuantos productos desea agregar al stock: ");
                    stock = scanner.nextInt();
                    producto.setStock(stock);
                    break;
                case 2:
                    System.out.print("Cuantos productos desea eliminar del stock: ");
                    stock = scanner.nextInt();
                    producto.reducirStock(stock);
                    break;
                case 3:
                    producto.mostrarProducto();
                    break;
                case 4:
                    System.out.println("Hasta luego papi Eder <3");
                    return;

            }
        }


    }
}