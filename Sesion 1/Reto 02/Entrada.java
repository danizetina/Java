public class Entrada {

    //Atributos
    String evento;
    double precio;

    // Constructor
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}