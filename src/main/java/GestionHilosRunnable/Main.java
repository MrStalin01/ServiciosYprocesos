package GestionHilosRunnable;

public class Main {
    public static void main(String[] args){
        Hilo2 h1 = new Hilo2("Juan", 50);
        Hilo2 h2 = new Hilo2("Luca", 30);
        Hilo2 h3 = new Hilo2("Greg", 10);

        h1.scheduleThread();
        h1.waitForThreadToFinish();
        h2.scheduleThread();
        h3.scheduleThread();
        System.out.println("FIn del programa");
    }



}
