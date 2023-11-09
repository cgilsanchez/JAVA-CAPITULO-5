public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5):");
        int altura = Integer.parseInt(System.console().readLine());
        int anchura = 6;
        if (altura%2!=0 && altura>=5) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < anchura; j++) {
                    if(i==altura/2 || i==0 || i==altura-1|| j==0||j==anchura-1) {
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();
            }
        }else{
            System.out.println("La altura introducida no es correcta");
        }
    }
}
