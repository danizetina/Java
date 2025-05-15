import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> consumos = new HashSet<>();
        boolean continuar = true;

        System.out.println("🔍 Ingreso de consumo de CPU de servidores (en %)");
        System.out.println("💡 Ingresa 'fin' para terminar.");

        try {
            while (continuar) {
                System.out.print("👉 Ingresa consumo CPU: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    continuar = false;
                    break;
                }

                try {
                    double valor = Double.parseDouble(entrada);

                    if (valor < 0 || valor > 100) {
                        System.out.println("⚠️ Valor fuera de rango (0-100%).");
                        continue;
                    }

                    if (consumos.contains(valor)) {
                        System.out.println("🔁 Valor duplicado. No se registra.");
                        continue;
                    }

                    if (valor > 95) {
                        throw new ConsumoCriticoException("🔥 Consumo crítico detectado: " + valor + "%");
                    }

                    consumos.add(valor);
                    System.out.println("✅ Valor registrado correctamente.");
                } catch (NumberFormatException e) {
                    System.out.println("❌ Entrada inválida. Debe ser un número.");
                } catch (ConsumoCriticoException e) {
                    System.out.println("🚨 " + e.getMessage());
                }
            }

            System.out.println("\n📊 Resumen de consumos registrados:");
            for (Double c : consumos) {
                System.out.println("🔸 " + c + "%");
            }

        } finally {
            scanner.close();
            System.out.println("🔚 Monitor finalizado. Recurso cerrado.");
        }
    }
}
