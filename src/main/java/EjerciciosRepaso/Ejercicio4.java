package EjerciciosRepaso;
//Crea un hilo que realice el cálculo de los primeros N números de la sucesión de Fibonacci.
// La sucesión de Fibonacci comienza con los números 1 y 1 y el siguiente elemento es
// la suma de los dos elementos anteriores.
// Así la sucesión de Fibonacci sería 0,1,1,2,3,5,8, 11.... El parámetro N será indicado
// cuando se llamé al constructor de la clase Thread.
//Por ejemplo, el valor de N podría ser 7.
public class Ejercicio4 extends Thread {
    private int n;

    public Ejercicio4(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0;
        int b = 1;

        System.out.print("Sucesión: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
    public static void main(String [] args){
        new Ejercicio4(7).start();
    }
}
