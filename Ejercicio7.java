import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contraseña = 1234;
        int intento = 0;
        do{
            System.out.println("Escriba la combinacion para poder abrir la caja fuerte");
            intento = sc.nextInt();
            
            if(contraseña==intento){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }else{
            System.out.println("Lo siento, esa no es la combinacion");
        }
        }while(contraseña!=intento);

        
        
        
        sc.close();
    }
}
