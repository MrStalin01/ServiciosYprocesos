package EjerciciosRepaso;

//3.- Crea una clase que implemente la interfaz Runnable cuya única funcionalidad sea visualizar
//el mensaje “Hola mundo “ seguido de una cadena que se recibirá en el constructor (es decir al
//crear un objeto de este tipo se enviará una cadena) y seguido del identificador del hilo. Crea un
//programa java que visualice el mensaje anterior 7 veces creando para ello 7 hilos diferentes
//usando la clase creada anteriormente

public class Ejercicio3 implements Runnable{
    private String name;

    public Ejercicio3(String texto){
        this.name = texto;
    }
    @Override
    public void run(){
        System.out.println("Creación de: " + this);
    }
    public class Hilos {
        public static void main(String [] args){
            System.out.println("--- Iniciando 7 hilos diferentes ---");

            for (int i = 1; i <= 7; i++) {
                Ejercicio3 tarea = new Ejercicio3("Cadena #" + i);
                Thread hilo = new Thread(tarea);
                hilo.start();
        }
    }
}
}
