
package consultorios;

public class Consultorio {
    public String id;
    public int piso;
    public String numeroConsultorio;


    public Consultorio(String id, int piso, String numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }


    public String mostrarDatosConsultorio() {
        return String.format("Id: %s, Número de piso: %d, Número de consultorio: %s", id, piso, numeroConsultorio);
    }

    public String getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }
}
