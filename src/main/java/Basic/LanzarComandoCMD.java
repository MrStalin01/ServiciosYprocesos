package Basic;

import java.io.IOException;
import java.io.InputStream;

public class LanzarComandoCMD {
    public static void main(String[] args) {
        System.out.println("Aquí comienza el lanzado.");
        ProcessBuilder creadorDeProceso = new ProcessBuilder("cmd", "/C", "dir"); // se crea el proceso en el cual sacaremos los datos
        Process proceso = null; // se declara null para que se pueda meter dentro de try/catch, si no declaramos null no podria acceder a ella
        int c;

        try {
            proceso = creadorDeProceso.start();
            InputStream chorro = proceso.getInputStream(); //aqui se procesa el chorro de datos que soltara el proceso

            c = chorro.read();
            while (c != -1) { //aqui es para que el programa lea caracter por caracter y mientras no sea -1 imprime
                System.out.print((char) c);
                c = chorro.read();
            }
            chorro.close();

            int codigoSalidaProceso = proceso.waitFor(); //aqui se espera para que el programa dir finalice por completo


            System.out.println("Valor de salida es: " + codigoSalidaProceso);
            System.out.println("Aquí se acaba la ejecución del programa lanzado.");

        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}