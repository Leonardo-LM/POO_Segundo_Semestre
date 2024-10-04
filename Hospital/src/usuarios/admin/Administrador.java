package usuarios.admin;

import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    private Double sueldo;
    private String rfc;
    private LocalDate aniosDeTrabajo;

    public Administrador(String id, String nombre, String apellido, LocalDate fechaNacimiento, Double sueldo, String rfc, LocalDate aniosDeTrabajo, String telefono, String contrasenia) {
        super(id, nombre, apellido, fechaNacimiento, telefono, contrasenia, Rol.ADMIN);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.aniosDeTrabajo = aniosDeTrabajo;


    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getRfc() {
        return rfc;
    }

    public LocalDate getAniosDeTrabajo() {
        return aniosDeTrabajo;
    }
}
