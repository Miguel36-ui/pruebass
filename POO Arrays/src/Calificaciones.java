public class Calificaciones {
    private double[] calificaciones;
    private double suma;

    // Constructor: inicializa el arreglo
    public Calificaciones(int cantidad) {
        this.calificaciones = new double[cantidad];
        this.suma = 0;
    }

    // Guardar calificación en el arreglo
    public void setCalificacion(int index, double valor) {
        calificaciones[index] = valor;
        suma += valor; // Igual que en el original: se va sumando
    }

    // Calcular el promedio
    public double calcularPromedio() {
        return suma / calificaciones.length;
    }
    public int getCantidad() {
        return calificaciones.length;
    }

}
