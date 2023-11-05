public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un numero entero y positivo: ");
        long n = Long.parseLong(System.console().readLine());
        long n1 = n;
        long volteado = 0;
        int pares = 0;
        int impares = 0;
        while(n>0){
            volteado = volteado*10+n%10;
            n/=10;
        }
        while(volteado>0){
        if ((volteado%10)%2==0) {
            pares++;
        }else if ((volteado%10)%2!=0) {
            impares++;
        }
        volteado /= 10;
        }
        System.out.println("El "+ n1 + " contiene "+ pares + " digitos pares y "+ impares+ " digitos impares");
    }
}
