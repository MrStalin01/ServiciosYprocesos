package EjerciciosRepaso;

//2.- Transforma el ejercicio anterior. Modifica el mensaje “Hola Mundo” en el hilo para incluir el
//identificador del hilo. Prueba de nuevo el programa Java creado anteriormente.

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
