import java.util.ArrayList;
import java.util.Random;

public class Categoria {
    public int id;
    public String nombre;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public Random random = new Random();

    public Categoria(String nombre) {
        this.id = random.nextInt(1, 10001);
        this.nombre = nombre;
    }

    public void registrarProductoEnCategoria(Producto producto) {
        this.listaProductos.add(producto);
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
