import java.util.LinkedList;

public class GestorTareas {
    private LinkedList<String> tareas = new LinkedList<>();

    

    public void agregarTarea(String descripcion) {
        tareas.add(new String(descripcion));
    }

    public void eliminarPrimeraTarea() {
        if (!tareas.isEmpty()) {
            System.out.println("Tarea eliminada: " + tareas.removeFirst());
        } else {
            System.out.println("No hay tareas para eliminar.");
        }
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("Lista de tareas:");
            for (String t : tareas) {
                System.out.println("- " + t);
            }
        }
    }
}

    

