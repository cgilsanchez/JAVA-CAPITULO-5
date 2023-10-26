import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        for(int i = num1;i<num2;i++){
            System.out.println(i);
            i+=6;
            
        }
        sc.close();
    }
}
