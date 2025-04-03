import java.util.Date;

public class ConsultaMedica {
    private Date fecha;
    private String diagnostico;
    private String tratamiento;
    private Medico medico;
    private Paciente paciente;

    public ConsultaMedica(Date fecha, String diagnostico, String tratamiento) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    public void registrarConsulta(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
        System.out.println("Consulta médica registrada para " + paciente.getNombre() + " por el médico " + medico.getNombre());
    }
}
