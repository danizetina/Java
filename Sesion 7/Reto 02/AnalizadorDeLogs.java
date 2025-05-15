import java.io.*;
import java.nio.file.*;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Mostrar resumen
            System.out.println("📊 RESUMEN DE ANÁLISIS:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + totalErrores);
            System.out.println("Cantidad de advertencias: " + totalWarnings);

            double porcentajeProblemas = 0.0;
            if (totalLineas > 0) {
                porcentajeProblemas = ((double)(totalErrores + totalWarnings) / totalLineas) * 100;
            }
            System.out.printf("Porcentaje de líneas con errores/advertencias: %.2f%%\n", porcentajeProblemas);

        } catch (IOException e) {
            // Si ocurre un error, guardar mensaje en registro_fallos.txt
            System.err.println("❌ Ocurrió un problema al leer el archivo.");
            guardarFallo(e.getMessage());
        }
    }

    // Método para guardar errores en archivo
    private static void guardarFallo(String mensaje) {
        Path rutaRegistro = Paths.get("registro_fallos.txt");
        try {
            Files.writeString(rutaRegistro, "Error detectado: " + mensaje);
            System.out.println("📝 Mensaje de error guardado en registro_fallos.txt");
        } catch (IOException ex) {
            System.err.println("❌ No se pudo guardar el mensaje de error.");
        }
    }
}
