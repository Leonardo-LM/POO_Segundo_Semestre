public class Main {
    public static void main(String[] args) {


        System.out.println("CocheUNO:");
        Coche autoUNO = new Coche("BMW", "M8 Coupe", 2025);
        autoUNO.mostrarInformacion();

        System.out.println("\nCocheDOS:");
        Coche autoDOS = new Coche("Volskwagen", "GLI", 2009);
        autoDOS.mostrarInformacion();

        System.out.println("\nCocheTRES:");
        Coche autoTRES = new Coche("Mazda", "Miata", 1990);
        autoTRES.mostrarInformacion();


    }
}
