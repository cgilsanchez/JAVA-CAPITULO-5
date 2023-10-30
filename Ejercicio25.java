import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        int volteado = 0;
        while(n>0){
            volteado = volteado*10+n%10;
            n=n/10;
        }
        System.out.println("El numero al reves es: "+ volteado);
        sc.close();
    }
}
