public class Medico {
        private String nombre;
        private String numeroLicencia;
        private String especialidad;

    public Medico(String nombre, String numeroLicencia, String especialidad) {
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }
    public void atenderPaciente(Paciente paciente, ConsultaMedica consulta) {
        System.out.println(this.nombre + " está atendiendo a " + paciente.getNombre());
        consulta.registrarConsulta(this, paciente);
    }

}
