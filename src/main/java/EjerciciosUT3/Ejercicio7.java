package EjerciciosUT3;
//Crea un programa que muestre de una manera eficiente los números primos que existen entre uno hasta un millón.
// Puedes crear una clase en la que al constructor se le indique el rango donde tiene que buscar los números primos.

public class Ejercicio7 extends Thread{
    private int inicio;
    private int fin;
    private String nombre;

    public Ejercicio7(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        double tiempoInicio = (double) System.currentTimeMillis();
        int contador = 0;

        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                contador++;

            }
        }
        double tiempoFin = (double) System.currentTimeMillis();
        double totalSegundos = (tiempoFin - tiempoInicio) / 1000.0;

        System.out.println(nombre + " terminó. Encontró " + contador + " primos en " + totalSegundos + " seg.");
    }
    private boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
