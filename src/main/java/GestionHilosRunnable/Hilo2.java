package GestionHilosRunnable;

public class Hilo2 implements Runnable{
    private Thread hilo;
    private int numeroIteraciones;
    public Hilo2(String nombre, int numeroIteraciones ){
        hilo = new Thread(this, nombre);
        this.numeroIteraciones = numeroIteraciones;
        System.out.println("Hilo creado: "+ hilo);
    }

    public void run() {
        System.out.println("Ejecucion: "+ hilo.getName());
        for (int i = 0; i< numeroIteraciones; i++){
            System.out.println(hilo.getName() + " : "+i);
        }
        System.out.println("Fin del bucle de "+hilo.getName());
    }

    public void scheduleThread() {
        hilo.start();
    }

    public void waitForThreadToFinish() {
        try {
            hilo.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
