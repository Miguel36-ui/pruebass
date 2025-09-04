import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner recibir = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        // Menú principal
        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Eliminar primera tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = recibir.nextInt();
            recibir.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    String tarea = recibir.nextLine();
                    gestor.agregarTarea(tarea);
                    break;
                case 2:
                    gestor.eliminarPrimeraTarea();
                    break;
                case 3:
                    gestor.mostrarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        recibir.close();
    }

    
}
