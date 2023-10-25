import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero :");
        int num=sc.nextInt();
        
        int multiplica = 0;
        System.out.println("La tabla de multiplicar de "+ num + "es :");
        for(int i = 0;i<11;i++){
            multiplica = num*i;
            
            System.out.println(num+"x"+i+ "=" + multiplica);
        }
        sc.close();
    }
}
