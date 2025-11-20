package practica_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        if (IsPalindromo(entrada)) {
            System.out.println("Es palindromo ");
        } else {
            System.out.println("No es palindromo ");
        }
    }

    public static boolean IsPalindromo(String candidato) {
        for (int i = 0; i < Math.abs(candidato.length() / 2); i++) {
            if (candidato.charAt(i) != candidato.charAt(candidato.length() - 1 - i)) {

            }
        }return false;
    }
}
