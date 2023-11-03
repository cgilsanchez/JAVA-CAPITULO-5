public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.print("Introduzcca la altura de la L:");
        int altura = Integer.parseInt(System.console().readLine());
        int base = (altura/2)+1;
        for(int i = 0;i<=altura-2;i++){
            System.out.println("*");
            
        }
        for(int j = altura-(altura-1);j<=base;j++){
                System.out.print("*");
            }
        
        
    }
}
