public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.print("Por favor , introduzca un numero: ");
        long n = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro numero: ");
        long n1 = Long.parseLong(System.console().readLine());
        long volteado = 0;
        long volteado1 = 0;
        while (n>0) {
            volteado = volteado*10+n%10;
            n/=10;
        }
        while (n1>0){
            volteado1 = volteado1*10+n1%10;
            n1/=10;
        }
        while (volteado>0 && volteado1>0) {
            if ((volteado%10)%2==0 && (volteado1%10)%2==0) {
                System.out.print("El numero formado por los digitos pares es ");
                System.out.print(volteado%10);
                System.out.print(volteado1%10);
                System.out.println();
            }else if ((volteado%10)%2!=0 && (volteado1%10)%2!=0) {
                System.out.print("El numero formado por los digitos impares es ");
                System.out.print(volteado%10);
                System.out.print(volteado1%10);
            }
            volteado/=10;
            volteado1/=10;
        }
    }
}
