package monitorDeTartas;



public class Comprador extends Thread{
    String nombre;
    Vitrina vitrina;
    int cantidadComprada;

    public Comprador(Vitrina vitrina, String nombre, int cantidadComprada) {
        super(nombre);
        this.vitrina = vitrina;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
    }
    @Override
    public void run(){
        for (int i = 0; i < cantidadComprada; i++) {
            vitrina.comprar(nombre);
        }
    }
}
