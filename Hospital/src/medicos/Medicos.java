package medicos;

public class Medicos {
    public int id;
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    private String telefono;
    private String rfc;

    public Medicos(int id, String nombre, String apellido, String fechaNacimiento, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }
}
