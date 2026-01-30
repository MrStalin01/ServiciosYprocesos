package EjerciciosUT3;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Ejercicio3 Impares = new Ejercicio3("Impares", 1, 100);
        Ejercicio3 Pares = new Ejercicio3("Pares", 2, 100);

        System.out.println("Calculo paralelo:");
        Impares.start();
        Pares.start();

        try {
            Impares.join();
            Pares.join();

            int total = Impares.sumaTotal + Pares.sumaTotal;
            System.out.println("FINAL");
            System.out.println("La suma de todos los números del 1 al 100 es: " + total);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
