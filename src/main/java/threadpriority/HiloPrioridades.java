package threadpriority;

/**
 * 1. Lo ejecutamos sin asignar prioridad
 * 2. Lo ejecutamos asignando mas prioridad a la luna (mirar antes que prioridad tiene cada uno)
 * 3. Lo ejecutamos asignando mas prioridad al sol
 * 4. lo ejecutamos asignando la minima prioridad a uno de los 2
 * 5. ¿Se obtiene los resultados esperados?
 */
public class HiloPrioridades extends Thread{
    public HiloPrioridades (String nombre){
        super (nombre);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+ ":" +i);
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public static void main (String[]args){
        HiloPrioridades h1 = new HiloPrioridades("luna");
        HiloPrioridades h2 = new HiloPrioridades("Sol");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        h2.start();

    }

}
