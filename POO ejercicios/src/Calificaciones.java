    import java.util.Scanner;

public class Calificaciones {
    public void ejecutar() {
        double[] calificaciones = new double[5];
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}

    

