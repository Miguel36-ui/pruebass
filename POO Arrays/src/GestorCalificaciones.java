import java.util.Scanner;

public class GestorCalificaciones {
    private Calificaciones calificaciones;

    public GestorCalificaciones(int cantidad) {
        this.calificaciones = new Calificaciones(cantidad);
    }

    // Pedir al usuario las calificaciones
    public void pedirCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        int cantidad = calificaciones.getCantidad(); // Asegúrate de tener este método en Calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            calificaciones.setCalificacion(i, nota);
        }
    }

    // Mostrar el promedio
    public void mostrarPromedio() {
        double promedio = calificaciones.calcularPromedio();
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
