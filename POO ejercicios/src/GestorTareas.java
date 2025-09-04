import java.util.LinkedList;
import java.util.Scanner;

public class GestorTareas {
    public void ejecutar() {
        LinkedList<String> tareas = new LinkedList<>();
        Scanner recibir = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar primera tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = recibir.nextInt();
            recibir.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    String tarea = recibir.nextLine();
                    tareas.add(tarea);
                    break;
                case 2:
                    if (!tareas.isEmpty()) {
                        System.out.println("Tarea eliminada: " + tareas.removeFirst());
                    } else {
                        System.out.println("No hay tareas para eliminar.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tareas:");
                    for (String t : tareas) {
                        System.out.println("- " + t);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo de gestor de tareas...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
