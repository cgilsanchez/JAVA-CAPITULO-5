public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        int operacion = 1;
        for (int i = 1; i <= n; i++) {
            operacion=operacion*i;
            System.out.println(i +"! = "+ operacion);
        }
    }
}
