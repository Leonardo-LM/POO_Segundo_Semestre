import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar categoria");
            System.out.println("5. Registrar categoria");
            System.out.println("6. Mostrar categorias y productos");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (!inventario.validarExistenciaDeCategorias()) {
                        System.out.println("\nNo esxisten categorias en el sistema");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Ingresa el id de la categoria en la cual registrataras el producto: ");
                    int idCategoria = scanner.nextInt();
                    boolean bandera = true;

                    while (bandera) {
                        System.out.println("Categorias");

                        boolean categoriaEncontrada = false;

                        for (Categoria categoria : inventario.listaCategorias) {
                            if (idCategoria == categoria.id) {
                                System.out.println("Ingrese stock: ");
                                int stock = scanner.nextInt();
                                scanner.nextLine();

                                Producto producto = new Producto(nombre, precio, descripcion, idCategoria, stock);
                                inventario.registrarProducto(producto);
                                bandera = false;
                                categoriaEncontrada = true;
                                break;
                            }
                        }

                        if (!categoriaEncontrada) {
                            System.out.println("Ninguna coincidencia en el id de la categoria dada. Ingrese otro id:");
                            idCategoria = scanner.nextInt();
                        }
                    }


                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    inventario.mostrarCategorias();
                    break;
                case 5:
                    System.out.println("\nSeleccionaste la opcion para registrar una categoria");

                    System.out.print("Ingresa el nombre de la categoria: ");
                    String nombreCategoria = scanner.nextLine();

                    Categoria categoria = new Categoria(nombreCategoria);
                    inventario.registrarCategoria(categoria);


                    System.out.println("\nCategoria registrada correctamente");
                    break;
                case 6:
                    inventario.mostrarProductosYCategorias();
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
