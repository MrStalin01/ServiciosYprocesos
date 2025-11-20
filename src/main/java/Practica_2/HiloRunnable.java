package Practica_2;
// El implements Runnable es el padre, al llamar al Thread hilo implementamos un hijo(hilo).
//usamos el this y llamamos al nombre
public class HiloRunnable implements Runnable{
    Thread hilo;
    public HiloRunnable (String nombre){
        hilo = new Thread(this, nombre);
        System.out.println("Hilo creado: "+ hilo);
        hilo.start();
    }
    public void run(){
        System.out.println("Ejecucion "+ hilo.getName());
    }

    public static void main(String[] args){
        System.out.println("Creacion de un hilo en main: ");
        new HiloRunnable("Hilo 1: ");
        new HiloRunnable("Hilo 2: ");
        System.out.println("Ha terminado el hilo.");
    }
}
