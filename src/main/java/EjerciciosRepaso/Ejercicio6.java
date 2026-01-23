package EjerciciosRepaso;

//Escribe una clase que contenga un atributo que sea un contador,
// otro que sea el nombre del hilo y otro que sea el límite del contador,
// es decir donde debe de acabar.
//Después al crear la clase principal debes de crear 4 contadores y ejecútarlos.
//NOTA: Join

public class Ejercicio6 implements Runnable{
    private String nombre;
    private int limite;
    private int contador;

    public Ejercicio6(String nombre, int limite){
        this.nombre = nombre;
        this.limite = limite;
        this.contador = 0;
    }
    @Override
    public void run(){
        System.out.println("Iniciando hilo: " + nombre);
        while (contador < limite) {
            contador++;
            System.out.println("Valor: " + contador);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalizado: " + nombre);
    }
    public static void main(String[]args){
        Thread h1 = new Thread(new Ejercicio6("Hilo 1", 5));
        Thread h2 = new Thread(new Ejercicio6("Hilo 2", 8));
        Thread h3 = new Thread(new Ejercicio6("Hilo 3", 3));
        Thread h4 = new Thread(new Ejercicio6("Hilo 4", 6));
        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final");
    }
}

