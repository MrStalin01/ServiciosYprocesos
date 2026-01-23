package EjerciciosRepaso;

//5.- Escribe una clase que implemente la interfaz Runnable y que tenga como atributo un
//número llamado tipo.
//Si el tipo es 1, mostrará los números del 1 al 30
//Si el tipo es 2, mostrará las letras de la ‘a’ a la ‘z’

public class Ejercicio5 extends Thread{
    private int tipo;

    public Ejercicio5(int tipo){
        this.tipo = tipo;
    }
    @Override
    public void run() {
        if (tipo == 1) {
            for (int i = 1; i <= 30; i++) {
                System.out.print(i + " ");
            }
            System.out.println("Fin Números");

        } else if (tipo == 2) {
            for (char letra = 'a'; letra <= 'z'; letra++) {
                System.out.print(letra + " ");
            }
            System.out.println("Fin Letras");

        } else {
            System.out.println("Tipo no válido.");
        }
    }
    public static void main(String[] args) {
        Ejercicio5 tareaNumeros = new Ejercicio5(1);
        Ejercicio5 tareaLetras = new Ejercicio5(2);

        Thread hilo1 = new Thread(tareaNumeros);
        Thread hilo2 = new Thread(tareaLetras);

        hilo1.start();
        hilo2.start();
    }
}


