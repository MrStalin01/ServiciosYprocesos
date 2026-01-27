package monitorDeTartas;

public class Vitrina {
    private boolean turnoConsumidor = false;
    public String opcion = "";

    public synchronized void comprar(String comprador) {
        while (!turnoConsumidor) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(comprador + " ha comprado una tarta de "+ opcion);
        opcion = "";
        turnoConsumidor = false;
        notifyAll();
    }

    public synchronized void hornear(String productor, String sabor){
        while(turnoConsumidor){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        opcion = sabor;
        System.out.println("El respostero "+ productor + " ha hecho una tarta de "+ sabor);
        turnoConsumidor = true;
        notifyAll();
    }
}
