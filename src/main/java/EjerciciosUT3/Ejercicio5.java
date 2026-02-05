package EjerciciosUT3;
import java.util.Arrays;
//Calcula el tiempo, en segundos, que tarda el ordenador en ordenar dos arrays de enteros de 100.000 elementos con
// números aleatorios de entre 1 y 1000. Monitoriza la CPU mientras se ejecuta

public class Ejercicio5 extends Thread {
    private String nombre;
    private int[] datos;
    private double tiempoSegundos;
    private long inicio, fin;

    public Ejercicio5(String nombre, int[] datos) {
        super(nombre);
        this.nombre = nombre;
        this.datos = datos.clone();
    }

    @Override
    public void run() {
        inicio = System.currentTimeMillis();
        System.out.println("Comenzando ordenar...");

        Arrays.sort(datos);

        fin = System.currentTimeMillis();
        tiempoSegundos = (fin - inicio) / 1000.0;

        System.out.println(nombre + "Terminado, tiempo: " + tiempoSegundos + " segundos");
    }

    public double getTiempoSegundos() {
        return tiempoSegundos;
    }

    public String getNombre() {
        return nombre;
    }
}
