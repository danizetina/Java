public class CentralEmergencias {
    public static void main(String[] args) {
        UnidadEmergencia ambulancia = new Ambulancia("Ambulancia", new Operador("Juan"));
        UnidadEmergencia patrulla = new Patrulla("Patrulla", new Operador("Laura"));
        UnidadEmergencia bomberos = new UnidadBomberos("UnidadBomberos", new Operador("Marco"));

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}
