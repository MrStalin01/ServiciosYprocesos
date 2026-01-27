package monitor;

public class Main {
    public static void main(String[] args){
        BufferMonitor bufferMonitor = new BufferMonitor();
        Thread productor = new Thread(new Productor(bufferMonitor));
        Thread consumidor = new Thread(new Consumidor(bufferMonitor));

        productor.start();
        consumidor.start();
    }
}
