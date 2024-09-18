import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public void registrarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    public void registrarCategoria(Categoria categoria) {
        this.listaCategorias.add(categoria);
    }


    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("Se eliminó el prodcuto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

        if (this.listaProductos.size() == 0) {
            System.out.println("\nNo existen productos en el sistema");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\nEste es el producto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }

    public void mostrarCategorias() {
        System.out.println("\n*** CATEGORIAS EN EL SISTEMA ***");

        if (this.listaCategorias.size() == 0) {
            System.out.println("\nNo existen categorias");
        }


        for (Categoria categoria : listaCategorias) {
            System.out.println("\nCategoria: " + categoria.getNombre());
            System.out.println("Id de la categoria: " + categoria.getId());
        }
    }

    public void mostrarProductosYCategorias() {
        System.out.println("\n*** CATEGORIAS Y PRODUCTOS EN EL SISTEMA ***");

        // Recorremos todas las categorías
        for (Categoria categoria : listaCategorias) {
            System.out.println("Categoría: " + categoria.nombre);

            // Contador para enumerar los productos
            int productoIndex = 1;
            boolean tieneProductos = false; // Para verificar si una categoría tiene productos

            // Recorremos todos los productos
            for (Producto producto : listaProductos) {
                // Si el producto pertenece a la categoría actual
                if (producto.idCategoria == categoria.id) {
                    System.out.println("Producto: " + productoIndex + ": [" +
                            producto.nombre +
                            " Descripción: " + producto.descripcion +
                            " Precio: " + producto.precio +
                            " Stock: " + producto.stock + "]");
                    productoIndex++;
                    tieneProductos = true;
                }
            }

            // Si no tiene productos, indicamos que no hay productos para esta categoría
            if (!tieneProductos) {
                System.out.println("Esta categoría no tiene productos.");
            }
        }

    }

    public boolean validarExistenciaDeCategorias() {
        return this.listaCategorias.size() > 0;

    }
}
