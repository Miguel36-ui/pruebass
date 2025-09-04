import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public void ejecutar() {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String entrada;

        System.out.println("Ingresa nombres (escribe 'salir' para terminar):");
        while (true) {
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            nombres.add(entrada);
        }

        System.out.println("Nombres ingresados:");
        for (String nombre : nombres) {
            System.out.println("El nombre ingresado fue: " + nombre);
        }
    }
}
