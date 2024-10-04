package usuarios;

import utils.Rol;

import java.time.LocalDate;

public class Usuario {
    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String telefono;
    public Rol rol; // enum
    private String contrasenia;

    public Usuario(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String contrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rol = rol;
        this.contrasenia = contrasenia;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public Rol getRol() {
        return rol;
    }

    protected String getContrasenia() {
        return contrasenia;
    }
}
