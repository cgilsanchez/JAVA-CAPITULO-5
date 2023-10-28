/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int contador = 0;
        int contnega = 0;
        int media = 0;;
        while(n>=0){
            System.out.println("Introduzca un numero: ");
            n= sc.nextInt();
            if (n>0){
            if(n%2!=0){
                contnega++;
                media=media+n;
                
                
            }
        }else{
            break;
        }
            contador++;
        }
        System.out.println("Se han introducido " + contador + " numeros");
        System.out.println("La media de los numeros impares es de: " + media/contnega);
        sc.close();
        
    }
}
