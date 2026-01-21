package EjerciciosRepaso;

import Practica_2.HiloThread;

/// 1.- Crea una clase que extienda de Thread cuya única funcionalidad sea visualizar el mensaje
/// “Hola mundo”. Crea un programa Java que visualice el mensaje anterior 5 veces creando para
/// ello 5 hilos diferentes usando la clase creada anteriormente.

public class Ejercicio1 extends Thread {
    public Ejercicio1 (String name){
        super(name);
    }
    public void run(){
        System.out.println("Creacion de: " + this);
        System.out.println(this.getName());
    }
    public static void main(String[] args){
        System.out.println("INICIO");
        new HiloThread("Hola mundo").start();
        new HiloThread("Hola mundo").start();
        new HiloThread("Hola mundo").start();
        new HiloThread("Hola mundo").start();
        new HiloThread("Hola mundo").start();
        System.out.println("Final");

    }
}
