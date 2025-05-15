import java.util.Scanner;

public class Principal {
    public static void main (String[] args){

        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Show de Stand Up", 350.0);
        Entrada entrada3 = new Entrada("Exposición de arte", 300.0);
        Entrada entrada4 = new Entrada("Concierto", 550.0);
        Entrada entrada5 = new Entrada("Show de Magia", 250.0);

        // Mostrar la información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
        entrada4.mostrarInformacion();
        entrada5.mostrarInformacion();

        // Usando  Entrada_Record
        Entrada_Record entrada6 = new Entrada_Record("Obra de Teatro", 450.0);
        Entrada_Record entrada7 = new Entrada_Record("Show de Stand Up", 350.0);
        Entrada_Record entrada8 = new Entrada_Record("Exposición de arte", 300.0);
        Entrada_Record entrada9 = new Entrada_Record("Concierto", 550.0);
        Entrada_Record entrada10 = new Entrada_Record("Show de Magia", 250.0);

        // Mostrar la información
        System.out.println("\nEntrada Record");
        entrada6.mostrarInformacion();
        entrada7.mostrarInformacion();
        entrada8.mostrarInformacion();
        entrada9.mostrarInformacion();
        entrada10.mostrarInformacion();
    }
}