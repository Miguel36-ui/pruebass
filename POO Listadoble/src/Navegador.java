import java.util.Scanner;

public class Navegador {
    private Historial historial;
    private Scanner scanner;

    public Navegador() {
        historial = new Historial();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Comandos: visitar [url], atras, adelante, salir");

        while (true) {
            System.out.print("> ");
            String comando = scanner.nextLine();

            if (comando.startsWith("visitar ")) {
                String url = comando.substring(8);
                historial.visitar(url);

            } else if (comando.equals("atras")) {
                historial.atras();

            } else if (comando.equals("adelante")) {
                historial.adelante();

            } else if (comando.equals("salir")) {
                System.out.println("Saliendo...");
                break;

            } else {
                System.out.println("Comando no reconocido.");
            }
        }
    }
}
