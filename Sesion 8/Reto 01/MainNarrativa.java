public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Te encuentras frente a dos caminos... uno lleva al bosque, otro al pueblo.");
        String eleccion = decision.tomarDecision();
        transicion.transicionar(eleccion);
        dialogo.mostrarDialogo("La historia continuará según tus decisiones...");
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
