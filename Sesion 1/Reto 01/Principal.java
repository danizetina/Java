import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Paciente
        Paciente paciente = new Paciente();

        // Pedir y asignar datos
        System.out.print("Ingresa el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingresa el número de expediente: ");
        paciente.expediente = scanner.nextLine();

        // Mostrar información del paciente
        System.out.println("\nInformación del paciente:");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
