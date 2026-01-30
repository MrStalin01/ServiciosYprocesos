package EjerciciosUT3;

public class Ejercicio7_1 {
    public static void main (String [] args){
        int limite = 1000000;

        Ejercicio7 h1 = new Ejercicio7("Hilo1", 1, 250000);
        Ejercicio7 h2 = new Ejercicio7("Hilo2", 250001, 500000);
        Ejercicio7 h3 = new Ejercicio7("Hilo3", 500001, 750000);
        Ejercicio7 h4 = new Ejercicio7("Hilo4", 750001, 1000000);

        System.out.println("Buscando primos hasta " + limite + " con 4 hilos");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
