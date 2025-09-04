import java.util.ArrayList;

public class ListaNombres {

    private ArrayList<String> nombres = new ArrayList<>();

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public void mostrarNombres() {
        System.out.println("Nombres ingresados:");
        for (String n : nombres) {
            System.out.println("El nombre ingresado fue: " + n);
        }
    }
}
