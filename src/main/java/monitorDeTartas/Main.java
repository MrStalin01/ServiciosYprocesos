package monitorDeTartas;

public class Main {
    public static void main(String[] args){
        Vitrina vitrina = new Vitrina();
        Repostero r1 = new Repostero(vitrina, "Juan", "Chocolate", 3);
        Repostero r2 = new Repostero(vitrina, "Jorge", "Limon", 2);
        Repostero r3 = new Repostero(vitrina, "Luca", "Nata", 6);

        Comprador c1 = new Comprador(vitrina, "Pepe", 9);
        Comprador c2 = new Comprador(vitrina, "Alvaro", 4);

        r1.start();
        r2.start();
        r3.start();
        c1.start();
        c2.start();
    }
}
