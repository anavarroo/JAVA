import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        int resultado = 1;


        for (int i=0;i<n;i++){
            resultado = resultado*2;

            if (resultado==n) {
                System.out.println("Potencia");
                break;
            }
        }


    }
}
