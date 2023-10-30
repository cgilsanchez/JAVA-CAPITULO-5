import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.print("Introduzca un digito: ");
        int digito = sc.nextInt();
        int contador = 1;
        int buscaposicion= 0;
        int volteado = 0;
        while(n>0){
            volteado = volteado*10+n%10;
            n/= 10;
        }

        while(volteado>0){
            volteado/=10;
            buscaposicion = volteado%10;
            
            contador++;
            if(buscaposicion==digito){
            System.out.println("El digito ocupa la posicion "+ contador);
            }
        
        
        }
    sc.close();
    }
}
