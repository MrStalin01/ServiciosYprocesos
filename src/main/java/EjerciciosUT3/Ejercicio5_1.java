package EjerciciosUT3;
import java.util.Random;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        int capacidad = 100000;
        int[] array1 = generarNumeros(capacidad);
        int[] array2 = generarNumeros(capacidad);

        Ejercicio5 hilo1 = new Ejercicio5("Hilo1", array1);
        Ejercicio5 hilo2 = new Ejercicio5("Hilo2", array2);

        System.out.println("Monitoriza el CPU: ");
        hilo1.start();
        hilo2.start();
    }

    public static int[] generarNumeros(int cantidad) {
        Random r = new Random();
        int[] aux = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux[i] = r.nextInt(1000) + 1;
        }
        return aux;
    }
}
