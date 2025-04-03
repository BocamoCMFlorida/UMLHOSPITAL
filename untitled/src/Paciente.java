public class Paciente {
    private String nombre;
    private String numeroHistoriaClinica;
    private String direccion;

    public Paciente(String nombre, String numeroHistoriaClinica, String direccion) {
        this.nombre = nombre;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public String getDireccion() {
        return direccion;
    }
}
