import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Ruta del archivo de configuración
        Path rutaArchivo = Paths.get("config/parametros.txt");

        // Parámetros de simulación a escribir
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8";

        // Guardar los parámetros
        guardarParametros(rutaArchivo, parametros);

        // Verificar existencia y leer contenido
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ Archivo creado correctamente.");
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ El archivo no fue creado.");
        }
    }

    // Método para guardar los parámetros en un archivo
    public static void guardarParametros(Path ruta, String contenido) {
        try {
            // Crear carpeta config si no existe
            Files.createDirectories(ruta.getParent());

            // Escribir en el archivo (crea o sobreescribe)
            Files.writeString(ruta, contenido);
            System.out.println("📄 Parámetros guardados en: " + ruta);
        } catch (IOException e) {
            System.err.println("❌ Error al guardar parámetros: " + e.getMessage());
        }
    }

    // Método para leer y mostrar el contenido del archivo
    public static void leerParametros(Path ruta) {
        try {
            String contenido = Files.readString(ruta);
            System.out.println("\n📋 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
