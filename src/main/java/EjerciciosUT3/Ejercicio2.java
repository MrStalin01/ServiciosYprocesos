package EjerciciosUT3;
//Vamos a hacer nuestra versión recursiva del cuento del conejo y la tortuga, para ello, vamos a simular
// una carrera de 100 metros que contará con nuevo competidor una cigarra. Todos tendrán la misma velocidad. ¿Quién ganará?

public class Ejercicio2 extends Thread{
    private String nombre;
    private static final int meta = 100;
    private static boolean hayGanador = false;
    private int posicion;

    public Ejercicio2(String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.posicion = 0;
    }

    @Override
    public void run() {
        correr(posicion);
    }

    private void correr(int metros) {
        if (hayGanador) {
            return;
        }

        if (metros >= meta) {
            synchronized (this.getClass()) {
                if (!hayGanador) {
                    hayGanador = true;
                    System.out.println(nombre + " ha ganado la carrera");
                }
            }
            return;
        }

        try {
            Thread.sleep(10);
            correr(metros + 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }
}
