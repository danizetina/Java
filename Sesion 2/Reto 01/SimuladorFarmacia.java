import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del medicamento: ");
        String nombreMedicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        // Usamos 'var' para declarar el total sin descuento
        var totalSinDescuento = precioUnitario * cantidad;

        // ¿Aplica descuento?
        boolean aplicaDescuento = totalSinDescuento > 500;

        // Cálculo del descuento solo si aplica
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;

        // Total con descuento
        double totalPagar = totalSinDescuento - descuento;

        // Mostrar resultados
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
