import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * // Array (Arreglo) - Estrucutra indexada de tamaño fijo
         * // Ejercicio de calificaciones
         * 
         * // Declaramos un arreglo de 5 calificaciones
         * double[] calificaciones = new double[5];
         * Scanner scanner = new Scanner(System.in);
         * double suma = 0;
         * 
         * // Pedimos al usuario calificaciones
         * for (int i = 0; i < calificaciones.length; i++) {
         * System.out.print("Ingrese la calificación " + (i + 1) + ": ");
         * calificaciones[i] = scanner.nextDouble(); // Guardamos la calificación en el
         * arreglo
         * suma += calificaciones[i]; // Suma para calcular promedio despues
         * }
         * 
         * // Calculamos el promedio
         * double promedio = suma / calificaciones.length;
         * 
         * // Mostramos el resultado
         * System.out.printf("El promedio de las calificaciones es: " + promedio);
         */

        /*
         * // ArrayList - Lista dinamica de nombres
         * 
         * // Creamos un ArrayList para almacenar nombres
         * ArrayList<String> nombres = new ArrayList<>();
         * Scanner sc = new Scanner(System.in);
         * String entrada;
         * 
         * System.out.println("Ingresa nombres (escribe 'salir' para terminar):");
         * while (true) {
         * entrada = sc.nextLine(); // Leemos la entrada del usuario
         * if (entrada.equalsIgnoreCase("salir")) {
         * break; // Salimos del bucle si el usuario escribe 'salir'
         * }
         * nombres.add(entrada); // Agregamos el nombre a la lista
         * }
         * 
         * // Mostramos los nombres ingresados
         * System.out.println("Nombres ingresados:");
         * for (String nombre : nombres) {
         * System.out.println("El nombre ingresado fue: " + nombre);
         * }
         */

        /*
         * //Ejercicio LinkendList -Lista enlazada simple de tareas
         * 
         * //Creamos una LinkedList para las tareas
         * 
         * LinkedList<String> tareas = new LinkedList<>();
         * Scanner recibir = new Scanner(System.in);
         * int opcion;
         * 
         * //Menu principal
         * do {
         * System.out.
         * println("1.Agregar tarea \n2.Eliminar primera tarea \n3.Mostrar tareas \n4.Salir"
         * );
         * System.out.println("Elige una opcion: ");
         * opcion = recibir.nextInt(); //Leemos la opción del usuario
         * recibir.nextLine(); // Limpiamos el buffer
         * 
         * switch (opcion) {
         * case 1:
         * //Agregar nueva tarea
         * System.out.print("Escribe la tarea: ");
         * String tarea = recibir.nextLine(); // Leemos la tarea
         * tareas.add(tarea); // Agregamos la tarea a la lista
         * break;
         * case 2:
         * // Eliminamos la primera tarea
         * if (!tareas.isEmpty()) {
         * System.out.println("Tarea eliminada: " + tareas.removeFirst()); // Eliminamos
         * la primera tarea y la mostramos
         * } else {
         * System.out.println("No hay tareas para eliminar.");
         * }
         * break;
         * case 3:
         * // Mostramos todas las tareas
         * System.out.println("Lista de tareas:");
         * for (String t : tareas) {
         * System.out.println("- " + t);
         * }
         * break;
         * case 4:
         * System.out.println("Saliendo del programa.");
         * break;
         * default:
         * System.out.println("Opción no válida. Intente de nuevo.");
         * }
         * 
         * } while (opcion != 4); // Repetimos hasta que el usuario elija salir
         * }
         * 
         */

        // Lista doblemente enlazada - Historial de navegacion

        // Creamos una lista doblemente enlazada
        LinkedList<String> historial = new LinkedList<>();

        // Usamos un iterador para poder movernos adelante y atras
        ListIterator<String> iterador = historial.listIterator();

        Scanner escanear = new Scanner(System.in);
        String comando;
        String actual = null; // Pagina actual

        System.out.println("Comandos: visitar [url], atras, adelante, salir");

        while (true) {
            System.out.println(">");
            comando = escanear.nextLine();

            if (comando.startsWith("visitar ")) {
                // Extraemos la url después del comando visitar
                String url = comando.substring(8);
                // Nos aseguramos de estar al final antes de agregar una nueva página
                while (iterador.hasNext()) {
                    iterador.next();
                }
                iterador.add(url); // Agregamos la nueva página en nuestro historial
                actual = url;
                System.out.println("Visitando: " + actual);

            } else if (comando.equals("atras")) {
                // Retroceder en el historial si es posible
                if (iterador.hasPrevious()) {
                    actual = iterador.previous(); // Retrocedemos a la página anterior
                    System.out.println("Retrocedió a: " + actual);
                } else {
                    System.out.println("No hay páginas anteriores.");
                }

            } else if (comando.equals("adelante")) {
                // Avanzar en el historial si es posible
                if (iterador.hasNext()) {
                    actual = iterador.next(); // Avanzamos a la página siguiente
                    System.out.println("Avanzó a: " + actual);
                } else {
                    System.out.println("No hay páginas siguientes.");
                }

            } else if (comando.equals("salir")) {
                // Salir del programa
                System.out.println("Saliendo...");
                break;

            }
        }
    }
}
