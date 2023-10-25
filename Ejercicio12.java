import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int suma = 0;
        System.out.print(suma+ ", ");
        for(int i=0;i<=n;i++){
            num1 = num2;
            num2 = suma;
            suma = num1+num2;
            
            System.out.print(suma+ ", ");
        }
        sc.close();
    }
}
