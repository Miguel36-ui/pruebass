
import java.util.LinkedList;
import java.util.ListIterator;

public class Historial {
    private LinkedList<String> historial;
    private ListIterator<String> iterador;
    private String actual;

    public Historial() {
        historial = new LinkedList<>();
        iterador = historial.listIterator();
        actual = null;
    }

    public void visitar(String url) {
        // Aseguramos que estamos al final antes de agregar
        while (iterador.hasNext()) {
            iterador.next();
        }
        iterador.add(url);
        actual = url;
        System.out.println("Visitando: " + actual);
    }

    public void atras() {
        if (iterador.hasPrevious()) {
            actual = iterador.previous();
            System.out.println("Retrocedió a: " + actual);
        } else {
            System.out.println("No hay páginas anteriores.");
        }
    }

    public void adelante() {
        if (iterador.hasNext()) {
            actual = iterador.next();
            System.out.println("Avanzó a: " + actual);
        } else {
            System.out.println("No hay páginas siguientes.");
        }
    }

    public String getActual() {
        return actual;
    }
}

