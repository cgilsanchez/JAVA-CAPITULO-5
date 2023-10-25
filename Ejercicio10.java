import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num= 0;
        float suma= 0;
        float media = 0;
        int i = 0;
        
        do{
            System.out.println("Introduzca un numero");
            num=sc.nextInt();
            
            if(num>=0){
            suma=suma+num;
            i++;
            media = suma/i;
            
            }
            
        }while(num>=0);
        System.out.println("La media de los numeros introducidos es de : "+ media);
        sc.close();
    }
}
