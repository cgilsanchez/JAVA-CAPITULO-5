import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2=sc.nextInt();
            
        for(int i = num1;i>=1;i--){
                if(i%num2!=0){
                    System.out.println(i);
                }
            }
        sc.close();
    }
}
