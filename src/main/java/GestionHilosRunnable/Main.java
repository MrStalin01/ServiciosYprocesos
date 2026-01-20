package GestionHilosRunnable;

public class Main {
    public static void main(String[] args){
        Hilo2 h1 = new Hilo2("Juan", 10);
        Hilo2 h2 = new Hilo2("Luca", 10);
        Hilo2 h3 = new Hilo2("Greg", 10);
        //Aqui se le da los nombres que van a tener los procesos
        h1.scheduleThread(); // se llama a la clase para dar salida al primero que queramos
        h1.waitForThreadToFinish(); //esto es para hacer que termine al primero que se llamo
        h2.scheduleThread();
        h3.scheduleThread();
        System.out.println("FIn del programa");
    }


}
