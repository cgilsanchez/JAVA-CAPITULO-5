import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero: ");
        int n = sc.nextInt();
        int factorial = 0;
        factorial= n*(n-1);
        for(int i = n-2;i>=1;i--){
            factorial = factorial*i;
            
        }
        System.out.println(n + "! = "+ factorial);
        sc.close();
    }
}
