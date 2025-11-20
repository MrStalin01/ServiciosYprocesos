package practica_1;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//A continuación, crea un segundo programa Java que introduzca por teclado una cadena y
//ejecute el programa anterior para visualizar 5 veces esa cadena.

public class Ejercicio2Extra {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        ProcessBuilder processBuilder = new ProcessBuilder("java", "practica_1.Ejercicio2", cadena);
        Process process = null;
        File file = new File("./target/classes");
        processBuilder.directory(file);

        try {
            process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            int c = inputStream.read();
            while (c != -1){
                System.out.println((char)c);
                c = inputStream.read();

            }
            inputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
