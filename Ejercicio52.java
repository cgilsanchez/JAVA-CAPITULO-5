public class Ejercicio52 {
    public static int largo(long valor){
        int contador = 0;
        while(valor!=0){
            contador++;
            valor/=10;
        }
        return contador;
    }
    public static long rotaIzq(long valor){
        int longitud = largo(valor);
        int primer = (int)(valor/Math.pow(10, longitud-1));
        long resto = (long)((double)valor - (double)primer*Math.pow(10, longitud-1));
        return resto*10+primer;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El número resultado es %d.", rotaIzq(valor));
    }
}
