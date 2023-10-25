import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        int num = n;
        int numdig = 1;
        while(num>10){
            numdig++;
            num= num/10;
        }
        System.out.println("El numero "+ n + " tiene "+ numdig+ " digitos" );
        sc.close();
    }
}
