public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(System.console().readLine());
            
            for(int i = 1;i<=altura-1;i++){
                for(int j = 1;j<=altura;j++){
                    if(j==1||j==altura){
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
            }
            for(int i = 1;i<=altura;i++){
                if(i==1||i==altura){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            }
    }

