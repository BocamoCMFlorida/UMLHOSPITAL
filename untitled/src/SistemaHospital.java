import java.util.Date;
import java.util.Scanner;

public class SistemaHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un médico
        Medico medico = new Medico("Dr. Juan Pérez", "12345", "Cardiólogo");

        // Crear un paciente
        Paciente paciente = new Paciente("Carlos García", "67890", "Calle Falsa 123");

        // Crear una consulta médica
        ConsultaMedica consulta = new ConsultaMedica(new Date(), "Dolor en el pecho", "Reposo y medicamentos");

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- Menú del Sistema de Hospital ---");
            System.out.println("1. Atender a un paciente");
            System.out.println("2. Registrar consulta médica");
            System.out.println("3. Ver toda la información");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Atender a un paciente
                    medico.atenderPaciente(paciente, consulta);
                    break;
                case 2:
                    // Registrar una consulta médica
                    System.out.println("Registro de consulta médica para: " + paciente.getNombre());
                    System.out.print("Ingrese el diagnóstico: ");
                    String diagnostico = scanner.nextLine();
                    System.out.print("Ingrese el tratamiento: ");
                    String tratamiento = scanner.nextLine();
                    consulta = new ConsultaMedica(new Date(), diagnostico, tratamiento);
                    System.out.println("Consulta médica registrada exitosamente.");
                    break;
                case 3:
                    // Ver toda la información
                    System.out.println("\n--- Información del Sistema ---");
                    medico.verInfo();
                    paciente.verInfo();
                    consulta.verInfo();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}