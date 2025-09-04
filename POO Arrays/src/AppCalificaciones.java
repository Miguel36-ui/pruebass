public class AppCalificaciones {
    public static void main(String[] args) {
        // Igual que en el original: arreglo de 5 calificaciones
        GestorCalificaciones gestor = new GestorCalificaciones(5);

        // Flujo del programa
        gestor.pedirCalificaciones();
        gestor.mostrarPromedio();
    }
}
