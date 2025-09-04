import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Historial {
    public void ejecutar() {
        LinkedList<String> historial = new LinkedList<>();
        ListIterator<String> iterador = historial.listIterator();
        Scanner escanear = new Scanner(System.in);
        String comando;
        String actual = null;

        System.out.println("Comandos: visitar [url], atras, adelante, salir");

        while (true) {
            System.out.print("> ");
            comando = escanear.nextLine();

            if (comando.startsWith("visitar ")) {
                String url = comando.substring(8);
                while (iterador.hasNext()) {
                    iterador.next();
                }
                iterador.add(url);
                actual = url;
                System.out.println("Visitando: " + actual);

            } else if (comando.equals("atras")) {
                if (iterador.hasPrevious()) {
                    actual = iterador.previous();
                    System.out.println("Retrocedió a: " + actual);
                } else {
                    System.out.println("No hay páginas anteriores.");
                }

            } else if (comando.equals("adelante")) {
                if (iterador.hasNext()) {
                    actual = iterador.next();
                    System.out.println("Avanzó a: " + actual);
                } else {
                    System.out.println("No hay páginas siguientes.");
                }

            } else if (comando.equals("salir")) {
                System.out.println("Saliendo del historial...");
                break;

            } else {
                System.out.println("Comando no válido.");
            }
        }
    }
}
