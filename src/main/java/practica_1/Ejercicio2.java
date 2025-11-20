//Crea un programa Java que visualice 5 veces la cadena que se le envía desde los
//argumentos de main(). Si no se le envía ninguna cadena que muestre un mensaje indicándolo y
//que finalice el programa con System.exit(1).
package practica_1;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ejercicio 2");

        if (args.length == 0){
            System.out.println("No hay cadena, finalizando con código 1.");
            System.exit(1);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(args[0]);
        }
    }
}
