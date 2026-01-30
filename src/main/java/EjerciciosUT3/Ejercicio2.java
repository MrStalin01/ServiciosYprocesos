package EjerciciosUT3;
//Vamos a hacer nuestra versión recursiva del cuento del conejo y la tortuga, para ello, vamos a simular
// una carrera de 100 metros que contará con nuevo competidor una cigarra. Todos tendrán la misma velocidad. ¿Quién ganará?

public class Ejercicio2 extends Thread{
    private String nombre;
    private final int META = 100;
    private static boolean hayGanador = false;

    public Ejercicio2(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void run() {
        correrRecursivo(0);
    }

    private void correrRecursivo(int posicionActual) {
        if (hayGanador)
            return;
        if (posicionActual >= META) {
            marcarVictoria();
            return;
        }
        try {
            Thread.sleep(10);
            correrRecursivo(posicionActual + 1);
        } catch (InterruptedException e) {
            System.out.println(nombre + " fue interrumpido.");
        }
    }
    private synchronized void marcarVictoria() {
        if (!hayGanador) {
            hayGanador = true;
            System.out.println(nombre.toUpperCase() + " ha ganado la carrera!");
        }
    }
}
