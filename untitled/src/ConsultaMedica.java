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
}
