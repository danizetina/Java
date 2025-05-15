public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero p1 = new Pasajero("Ana Martínez", "A123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento con objeto
        if (vuelo.reservarAsiento(p1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();

        // Mostrar itinerario sin reserva
        System.out.println(vuelo.obtenerItinerario());

        // Reservar asiento con nombre y pasaporte
        vuelo.reservarAsiento("Mario Gonzalez", "P987654");

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());
    }
}
