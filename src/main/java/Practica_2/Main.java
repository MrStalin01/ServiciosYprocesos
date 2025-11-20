package Practica_2;

public class Main {
    public static void main(String[] args){
        Hilo h1 = new Hilo("Josemi", 50);
        Hilo h2 = new Hilo("Greg", 10);
        Hilo h3 = new Hilo("JJ",7);
        h1.start();
        h2.start();
        //Join da prioridad y pone una barrera ante h3, h3 no empieza hasta h1 termine
        try {
            h1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h3.start();

        System.out.println("Final de programa");
    }
}
