package monitorDeTartas;

public class Repostero extends Thread{
    private Vitrina vitrina;
    private String nombre;
    private String sabor;
    private int cantidadProducida;

    public Repostero(Vitrina vitrina, String nombre, String sabor, int cantidadProducida) {
        super(nombre);
        this.vitrina = vitrina;
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidadProducida = cantidadProducida;
    }
    @Override
    public void run(){
        for (int i = 0; i < cantidadProducida; i++) {
            vitrina.hornear(nombre,sabor);
        }
    }
}
