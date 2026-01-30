package EjerciciosUT3;

//Vamos a crear una versión de hilos pares e impares, respectivamente. Uno gestione los números pares entre uno y 100
// y, el otro, los impares. Cada uno deberá notificar al final de su ejecución, el valor total de dicha suma.

public class Ejercicio3 extends Thread{
    public String nombre;
    public int inicio;
    public int fin;

    public int sumaTotal = 0;

    public Ejercicio3(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        this.sumaTotal = calcularSuma(inicio);
        System.out.println(nombre + " terminó. Suma: " + sumaTotal);
    }

    private int calcularSuma(int actual) {
        if (actual > fin) return 0;
        return actual + calcularSuma(actual + 2);
    }
}
