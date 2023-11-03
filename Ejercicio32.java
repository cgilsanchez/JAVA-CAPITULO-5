public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un numero entero positivo: ");
        long n = Long.parseLong(System.console().readLine());
        long volteado = 0;
        
        long suma = 0;
        while(n>0){
            volteado = volteado*10+n%10;
            n/= 10;
        }
        System.out.println("Digitos pares:");
        while (volteado>0) {
            if((volteado%10)%2==0){
                System.out.print(volteado%10 + " ");
                suma = suma + volteado%10;
                
            }
                        volteado/=10;
            
        }
        System.out.println("");
        System.out.println("Suma de los digitos pares :" + suma);
        
    }
}
