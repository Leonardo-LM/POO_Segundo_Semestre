import java.awt.*;
import java.util.ArrayList;

public class Estudiante {
    public String nombre;
    public String idEstudiante;
    ArrayList<Curso> cursos = new ArrayList<Curso>();


    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("\n***** ESTUDIANTE *****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id de estudiante: " + idEstudiante);
        System.out.println("----- CURSOS -----");

        for (int i = 0; i < cursos.size(); i++) {

            System.out.println("Nombre: " + cursos.get(i).nombreCurso + "\nCodigo: " + cursos.get(i).codigoCurso + "\nInstructor: " + cursos.get(i).instructor + "\n");
        }
    }


}
