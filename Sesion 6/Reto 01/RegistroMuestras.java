import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar el orden de llegada de las muestras
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");

        // Paso 2: HashSet para obtener las especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con nombre de investigador
        HashMap<String, String> muestrasInvestigadores = new HashMap<>();
        muestrasInvestigadores.put("M-001", "Dra. López");
        muestrasInvestigadores.put("M-002", "Dr. Hernández");
        muestrasInvestigadores.put("M-003", "M. García");

        // Paso 4: Mostrar resultados

        System.out.println("📥 Orden de llegada de las muestras:");
        for (String especie : listaMuestras) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧑‍🔬 Relación de ID de muestra → Investigador:");
        for (Map.Entry<String, String> entrada : muestrasInvestigadores.entrySet()) {
            System.out.println("- " + entrada.getKey() + " → " + entrada.getValue());
        }

        // Búsqueda por ID
        String idBusqueda = "M-002";
        System.out.println("\n🔎 Búsqueda por ID de muestra: " + idBusqueda);
        if (muestrasInvestigadores.containsKey(idBusqueda)) {
            System.out.println("✔️ Investigador responsable: " + muestrasInvestigadores.get(idBusqueda));
        } else {
            System.out.println("❌ No se encontró información para ese ID.");
        }
    }
}
