import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Calificaciones (Array)");
            System.out.println("2. Lista de nombres (ArrayList)");
            System.out.println("3. Gestor de tareas (LinkedList)");
            System.out.println("4. Historial de navegación (Doubly LinkedList)");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    new Calificaciones().ejecutar();
                    break;
                case 2:
                    new ListaNombres().ejecutar();
                    break;
                case 3:
                    new GestorTareas().ejecutar();
                    break;
                case 4:
                    new Historial().ejecutar();
                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
