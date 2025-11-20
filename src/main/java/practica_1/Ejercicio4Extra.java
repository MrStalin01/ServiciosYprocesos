package practica_1;
import java.io.*;
import java.util.Scanner;

public class Ejercicio4Extra {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String lanzamiento = sc.nextLine();

        ProcessBuilder processBuilder = new ProcessBuilder("java", "practica_1.Ejercicio4");
        File directory = new File("./target/classes");
        processBuilder.directory(directory);
        Process process = null;

        try{
            process = processBuilder.start();

            OutputStream os = process.getOutputStream();
            os.write(lanzamiento.getBytes());
            os.flush();

            FileWriter fileWriter = new FileWriter("salida-ejercicio4.txt");
            BufferedWriter escritor = new BufferedWriter(fileWriter);

            InputStream is = process.getInputStream();
            BufferedReader lector = new BufferedReader(new InputStreamReader(is));
            String linea = lector.readLine();
            while (linea != null) {
                escritor.write(linea);
                escritor.newLine();
                linea = lector.readLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}


