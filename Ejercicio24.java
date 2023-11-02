import java.util.Scanner;
/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
*/


public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el número n
        System.out.println("Introduzca el número de filas de la pirámide:");
        int n = sc.nextInt();

        // Imprimir la pirámide
        for (int i = 1; i <= n; i++) {
            // Imprimir los espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            // Imprimir los números
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Imprimir un salto de línea
            System.out.println();
        }
        sc.close();
    }
}


