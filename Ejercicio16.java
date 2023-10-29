import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero por teclado para saber si es primo o no");
        int n = sc.nextInt();
        for(int i = 1;i<=1;i++){
            if(n%2==0){
                System.out.println(" No es un numero primo");

            }else{
                System.out.println("El numero es primo");
            }
            
        }

        sc.close();
    }
}
