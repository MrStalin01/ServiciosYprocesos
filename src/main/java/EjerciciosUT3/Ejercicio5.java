package EjerciciosUT3;
import java.util.Arrays;
//Calcula el tiempo, en segundos, que tarda el ordenador en ordenar dos arrays de enteros de 100.000 elementos con
// números aleatorios de entre 1 y 1000. Monitoriza la CPU mientras se ejecuta

public class Ejercicio5 extends Thread{
    private String nombre;
    private int[] datos;
    private double tiempoSegundos;

    public Ejercicio5(String nombre, int[] datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    @Override
    public void run() {
        double inicio = (double) System.currentTimeMillis();
        System.out.println(nombre + " empezando a ordenar...");
        Arrays.sort(datos);

        double fin = (double) System.currentTimeMillis();
        this.tiempoSegundos = (fin - inicio) / 1000.0;
        System.out.println(nombre + " completado en " + tiempoSegundos + " seg.");
    }
}
