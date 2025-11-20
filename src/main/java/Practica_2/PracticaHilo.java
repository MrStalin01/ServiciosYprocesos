package Practica_2;

public class PracticaHilo implements Runnable{
    Thread hilo;

    public PracticaHilo(String nombre){
        hilo = new Thread(this,"Hilo prueba"); //Se le da un contexto "this" y el nombre
        System.out.println("Hilo creado: " + hilo);
        hilo.start();
    }

    public void run() { //Dentro del run es donde se ejecuta el programa
        System.out.println("Ejecución" + getClass());
    }
    public static void main(String[] args){
        System.out.println("Creacion de un hilo en main: ");
        new PracticaHilo("hilo 1");//llamamos a esto para crear un subproceso
        new PracticaHilo("hilo 2");
        System.out.println("Ha terminado el hilo. ");
    }
}
