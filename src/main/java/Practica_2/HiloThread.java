package Practica_2;

public class HiloThread extends Thread{
    public HiloThread (String name){
        super(name);
    }
    public void run(){
        System.out.println("Creacion de: " + this);
        System.out.println(this.getName());
    }
    public static void main(String[] args){
        System.out.println("INICIO");
        new HiloThread("hilo1").start();
        new HiloThread("hilo2").start();
        System.out.println("Final");

    }
}
