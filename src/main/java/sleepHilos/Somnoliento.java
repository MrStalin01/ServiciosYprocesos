package sleepHilos;

public class Somnoliento extends Thread{
    public Somnoliento(String nombre){
        System.out.println(nombre);;
    }
    public static boolean esPalindromo(String cadena) {
        String cadenaLimpia = cadena.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (cadenaLimpia.isEmpty()) {
            return false;
        }

        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();

        return cadenaLimpia.equals(cadenaInvertida);
    }
}

