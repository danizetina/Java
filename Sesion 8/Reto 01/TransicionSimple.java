 public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("📜 Transición: El héroe entra en el bosque misterioso...");
        } else if (decision.equalsIgnoreCase("B")) {
            System.out.println("📜 Transición: El héroe regresa al pueblo en busca de ayuda...");
        } else {
            System.out.println("📜 Transición desconocida. El destino es incierto.");
        }
    }
}