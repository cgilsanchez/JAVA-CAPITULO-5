public class Ejercicio51 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero entero(mayor que cero) :");
        long n = Long.parseLong(System.console().readLine());
        long volteado = 0;
        while (n>0) {
            volteado= volteado*10+n%10;
            n/=10;
            if (volteado%10==0 || volteado%10==8) {
                System.out.println("Despues de haber sido comido por el gusano numerico se queda en "+volteado%10);
            }else{
                System.out.println("El gusano numerico no se ha comido ningun digito");
            }
        }
    }
}
