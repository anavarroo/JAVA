import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int res = (int) (Math.random() * 101);
        /* El numero lo saco por pantalla a funcion de guia para demostrar que el programa funciona correctamente. */
        System.out.println(res);
        int cont = 0;

        for (int i=0;i>-1;i++){
            System.out.println("Introduce el numero: ");
            int n = sc.nextInt();


            if (n<res){
                System.out.println("El numero es mayor...");
            } else if (n>res){
                System.out.println("El numero es menor...");
            }

            if (n==res){
                System.out.println("Numero correcto¡");
                cont = cont+1;
                if (cont <= 5){
                    System.out.println("Impresionante¡ Solo has necesitado " + cont + " rondas para acertar el numero¡");
                } else if (cont > 5 && cont <= 10){
                    System.out.println("No esta mal, pero puedes mejorar... has necesitado " + cont + " rondas para acertar el  numero");
                } else if (cont > 10) {
                    System.out.println("Eres un paquete... has necesitado " + cont + " rondas para acertar el  numero");
                }
                break;
            }
            else {
                System.out.println("Numero incorrecto, sigue intentandolo¡");
            }
            cont++;
        }

    }
}
