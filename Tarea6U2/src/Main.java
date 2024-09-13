public class Main {
    public static void main(String[] args) {
        Estudiante estudianteUno = new Estudiante("Leonardo", "1L56RTH6");
        Estudiante estudianteDos = new Estudiante("Nataly", "39HEK31I");

        Curso cursoUno = new Curso("Programacion Orientada a Objetos", "POO", "Eder");

        Curso cursoDos = new Curso("Algebra Lineal", "AL", "Oskar");

        Curso cursoTres = new Curso("Contabilidad Financiera", "CF", "Conrado");

        estudianteUno.agregarCurso(cursoUno);
        estudianteUno.mostrarInformacion();


        estudianteDos.agregarCurso(cursoDos);
        estudianteDos.mostrarInformacion();

        estudianteUno.agregarCurso(cursoTres);
        estudianteUno.mostrarInformacion();


    }
}