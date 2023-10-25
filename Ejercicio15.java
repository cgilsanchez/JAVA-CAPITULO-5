import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de la base");
        int base=sc.nextInt();
        System.out.println("Introduzca el valor del exponente");
        int exp=sc.nextInt();
        if(exp<0){
            System.out.println("Introduce un valor positovo para el exponente");

        }else{
            for(int i = 1;i<=exp;i++){
                System.out.print(base + "^" + i + " ");
                
            }
        }

        sc.close();
    }
}
