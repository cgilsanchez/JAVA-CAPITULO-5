public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura%2!=0 && altura>3) {
            System.out.println();
        }else{
            System.out.println("La altura debe ser impar y mayor a 3");
        }
    }
}
