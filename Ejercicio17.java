import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        int n = sc.nextInt();
        int suma = 0;
            if(n>0){
            for (int i=1;i<=100;i++){
                suma= suma+n;
                System.out.println(suma);
                n++;
            }
        }else{
            System.out.println("Introdizca un numero positivo");
        }
        
        sc.close();
    }
}
