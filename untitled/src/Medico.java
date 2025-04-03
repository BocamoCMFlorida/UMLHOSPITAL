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
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void verInfo() {
        System.out.println("Médico: " + nombre);
        System.out.println("Número de Licencia: " + numeroLicencia);
        System.out.println("Especialidad: " + especialidad);
    }
}
