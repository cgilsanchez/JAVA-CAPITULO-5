import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduca 10 numeros: ");
        int n = 0;
        int positivo= 0;
        int negativo = 0;
        for (int i = 0;i<10;i++){
            n = sc.nextInt();
            if(n>0){
                positivo++;
            }
            if(n<0){
                negativo++;
            }
        }
        System.out.println("Hay "+positivo+" numeros positivos y "+negativo+" numeros negativos.");
        sc.close();
    }
}
