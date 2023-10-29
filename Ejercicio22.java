
import java.util.Scanner;
/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 2;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
