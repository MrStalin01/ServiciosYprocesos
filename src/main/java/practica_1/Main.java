package practica_1;

/**
 * Realizar un programa que admita argumentos desde main()
 * System.exit()
 * Si el numero de argumentos es <1 devolveis 1
 * si el argumento es una cadena, 2
 * si el argumento es un numero entero menor que 0, 3
 * cualquier otra situacion: 0
 */

public class Main{
    public static void main (String []args){
        if (args.length == 0 ){
            System.out.println(1);
            System.exit(1);

        }else if (isNumeric((args[0]))){
            if(Integer.parseInt((args[0]) ) < 0){
                System.out.println(3);
                System.exit(3);

            }
            System.out.println(2);
            System.exit(2);
        }
        else {
            System.out.println(0);
            System.exit(1);
        }
    }
    public static boolean isNumeric(String cadena){
        try{
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}