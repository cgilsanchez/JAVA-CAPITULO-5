import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        double n2 = 0;
        double n3 = 0;
        for(int i=n;i<=5+n;i++){
            n2=Math.pow(i, 2);
            n3=Math.pow(i, 3);
            System.out.printf("%3d | %4.1f | %4.1f\n",i,n2,n3);
        }
        sc.close();
    }
}
