import java.util.Scanner;
/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int contador = 0;
        double promedio = (double) media / contador;
        while(media<10000){
            System.out.println("Introduzca un numero");
            int n = sc.nextInt();
            contador++;
                if(media<10000){
                    media=media+n; 
                }else{
                    System.out.println("La suma es: "+media+" El contador es: "+contador+" La media es: "+promedio);
                }
                
        }
        
        
        sc.close();
    }
}
