public class Ejercicio46 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la anchura del rectángulo (como mínimo 2):");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.println("Ahora introduzca la altura (como mínimo 2):");
        int altura = Integer.parseInt(System.console().readLine());
            if (anchura>1 && altura > 1) {
                for (int i=0;i<altura;i++) {
                    for (int j = 0; j < altura; j++) {
                        if (j==0 && j==anchura) {
                            System.out.print("*");
                        }else{
                            System.out.println(" ");
                        }
                    }
                    for (int j = 0; j < anchura; j++) {
                        System.out.print("*");
                    }
                }
            }else{
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
            }
        
    }
}
