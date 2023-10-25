import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de la base");
        Double base = sc.nextDouble();
        System.out.println("Introduzca el valor del exponente");
        double expo = sc.nextDouble();
        Double potencia = 0.0;
        if(expo<0){
            System.out.println("Introduzca un valor positivo");
        }
        while(expo>0){

            potencia = Math.pow(base, expo);

        }
        if(expo>0){
                System.out.println("La potencia es: "+ potencia);
            }
        sc.close();
    }
}
