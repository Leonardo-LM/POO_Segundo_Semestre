package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medicos;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medicos> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsulta = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medicos medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta) {
        // Paciente no tenga una consulta en esa fecha

        if (!validarDisponibilidadEnFecha(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio())) {
            System.out.println("Ya existe una consulta registrada para esa fecha");
            return;
        }

        this.listaConsulta.add(consulta);
    }

    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    private boolean validarDisponibilidadEnFecha(String fehcaDeseada, int numeroConsultorio) {
        for (Consulta consulta : listaConsulta) {
            if (consulta.getFechaHora().equals(fehcaDeseada) && numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()) {
                return false;
            }
        }
        return true;
    }
}
