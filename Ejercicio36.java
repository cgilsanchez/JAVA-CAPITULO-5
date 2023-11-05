public class Ejercicio36 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un numero entero positivo :");
        long n = Long.parseLong(System.console().readLine());
        long n1 = n;
        long volteado = 0;
        
        while (n>0) {
            volteado= volteado*10+n%10;
            n/=10;
            
        }
        if (n1==volteado) {
            System.out.println("El "+ n1 + "es capicua");
        }else{
            System.out.println("El "+ n1 + " no es capicua");
        }
    }
}
