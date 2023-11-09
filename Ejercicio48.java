public class Ejercicio48 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero entero: ");
        long n = Long.parseLong(System.console().readLine());
        long volteado = 0;
        
        
        while (n>0) {
            volteado = volteado*10 + n%10;
            n/= 10;
            for (int i = 0; i < 10; i++) {
                if (volteado%10 == i) {
                    System.out.print(volteado%10 + " ");
                }else{
                    System.out.print(i+ " ");
                }
            }
            System.out.print("Los digitos que aparecen en el numero: ");
            System.out.print("Dígitos que no aparecen:");
        }
    }
}
