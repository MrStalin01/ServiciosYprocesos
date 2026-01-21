package EjerciciosRepaso;

public class Ejercicio2 extends Thread {
    public Ejercicio2(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Creacion de: " + this);
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        System.out.println("INICIO");
        new Ejercicio1("Hola mundo").start();
        new Ejercicio1("Hola mundo").start();
        new Ejercicio1("Hola mundo").start();
        new Ejercicio1("Hola mundo").start();
        new Ejercicio1("Hola mundo").start();
        System.out.println("FINAL");

    }
}
