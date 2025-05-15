import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué decides hacer?");
        System.out.println("A) Aventurarte en el bosque");
        System.out.println("B) Volver al pueblo");
        System.out.print("👉 Tu elección (A/B): ");
        return sc.nextLine();
    }
}
