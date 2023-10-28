import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la piramide: ");
        int alturaPiramide = sc.nextInt();
        for (int i=0 ;i<alturaPiramide;i++){
            for (int j=0;j<=alturaPiramide-i;j++) {
                System.out.print(" ");
                }
            for(int k = 0;k<=i*2;k++){
                System.out.print("*");
            }
                System.out.println("");
                }
                
                
        sc.close();
    }
}
