public class Coche {
    String marca;
    String modelo;
    int edad;

    public Coche(String marca, String modelo, int edad) {
        this.marca = marca;
        this.modelo = modelo;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Edad: " + edad);

    }
}