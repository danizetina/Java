import java.util.concurrent.*;
import java.util.*;
import java.util.stream.Collectors;

public class PlanificadorTemario {
    public static void main(String[] args) {
        // Lista segura para los temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregar temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Ciencias naturales", 1));
        temas.add(new Tema("Educación artística", 3));

        // Mostrar lista ordenada alfabéticamente (orden natural - Comparable)
        System.out.println("🔤 Temas ordenados alfabéticamente:");
        List<Tema> ordenAlfabetico = temas.stream()
                .sorted()
                .collect(Collectors.toList());

        ordenAlfabetico.forEach(System.out::println);

        // Ordenar por prioridad ascendente usando Comparator
        System.out.println("\n🚦 Temas ordenados por prioridad:");
        List<Tema> ordenPrioridad = temas.stream()
                .sorted(Comparator.comparingInt(Tema::getPrioridad))
                .collect(Collectors.toList());

        ordenPrioridad.forEach(System.out::println);

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");
        recursos.put("Ciencias naturales", "https://recursos.edu/ciencias");
        recursos.put("Educación artística", "https://recursos.edu/arte");

        // Mostrar repositorio
        System.out.println("\n📚 Repositorio de recursos compartidos:");
        recursos.forEach((titulo, recurso) -> {
            System.out.println("- " + titulo + ": " + recurso);
        });
    }
}
