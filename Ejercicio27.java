import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un primer numero: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%3==0){
                System.out.println("Los multiplos de 3 son :");
                System.out.print(i);
            }
        }
        sc.close();
    }
}
