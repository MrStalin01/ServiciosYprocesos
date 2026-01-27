package monitor;


public class Consumidor implements Runnable{
    private BufferMonitor bufferMonitor;

    public Consumidor(BufferMonitor monitor) {
        this.bufferMonitor = monitor;
    }
    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                bufferMonitor.consumir();
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

