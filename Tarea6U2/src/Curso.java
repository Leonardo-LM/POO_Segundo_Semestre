public class Curso {
    public String nombreCurso;
    public String codigoCurso;
    public String instructor;

    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    public String mostrarInformacionCurso() {
        System.out.println("\n----- CURSOS DISPONIBLES -----");
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Codigo: " + codigoCurso);
        System.out.println("Instructor: " + instructor);
        return nombreCurso + codigoCurso + instructor;
    }


}
