package GestionHilosRunnable;

public class Hilo2 implements Runnable{
    private Thread hilo;
    private int numeroIteraciones; //distancia que recorre
    public Hilo2(String nombre, int numeroIteraciones ){
        hilo = new Thread(this, nombre);
        this.numeroIteraciones = numeroIteraciones;
        System.out.println("Hilo creado: "+ hilo); // se le inscribe la persona + el recorrido
    }

    public void run() {
        System.out.println("Ejecucion: "+ hilo.getName()); // se le ejecuta
        for (int i = 0; i< numeroIteraciones; i++){  // i son los pasos que recorre con la distancia(numeroIteraciones)
            System.out.println(hilo.getName() + " : "+i++);
        }
        System.out.println("Fin del bucle de "+hilo.getName()); //aqui se decide quien ha terminado antes
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
