import java.util.Scanner;

public class GestorNombres {
        private ListaNombres lista = new ListaNombres();

    public void pedirNombres() {
        Scanner sc = new Scanner(System.in);
        String entrada;

        System.out.println("Ingresa nombres (escribe 'salir' para terminar):");
        while (true) {
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            lista.agregarNombre(entrada);
        }
    }

    public void mostrar() {
        lista.mostrarNombres();
    }

    
}
